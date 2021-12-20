package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.log.LogHandler;
import br.edu.ifpb.padroes.service.log.LogService;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.payment.PaymentStrategy;
import br.edu.ifpb.padroes.service.mail.EmailNotification;

public class OrderManager {

    
    public OrderManager(Order order) {
        this.order = order;
    }

    private Order order;

    private EmailNotification emailNotification = new EmailNotification();

    private PaymentService paymentService = new PaymentService();

    private OrderInProgress orderInProgress = new OrderInProgress(order);
    private OrderRefused orderRefused = new OrderRefused(order);
    private OrderFinished orderFinished = new OrderFinished(order);
    private OrderCanceled orderCanceled = new OrderCanceled(order);


    private LogService logService = new LogService(new LogHandler(LogHandler.LogHandlerType.FILE));

    public void payOrder(PaymentStrategy paymentStrategy) {
        order.setStatus(orderInProgress.inProgress());
        try {
            paymentService.doPayment(paymentStrategy);
            order.setStatus(orderFinished.finished());
            emailNotification.sendMailNotification(String.format("Order %d completed successfully", order.getId()));
            logService.info("payment finished");
        } catch (Exception e) {
            logService.error("payment refused");
            order.setStatus(orderRefused.refused());
            emailNotification.sendMailNotification(String.format("Order %d refused", order.getId()));
        }
    }

    public void cancelOrder() {
        order.setStatus(orderCanceled.canceled());
        emailNotification.sendMailNotification(String.format("Order %d canceled", order.getId()));
        logService.debug(String.format("order %d canceled", order.getId()));
    }

}
