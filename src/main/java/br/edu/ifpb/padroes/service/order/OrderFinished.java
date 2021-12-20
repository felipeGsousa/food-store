package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.payment.PaymentStrategy;

public class OrderFinished extends OrderStates{

    protected OrderFinished(Order order) {
        super(order);
    }

    private OrderManager orderManager;

    @Override
    public String inProgress() {
        return "finished...";
    }

    @Override
    public String finished(PaymentStrategy paymentStrategy) {
        orderManager.payOrder(paymentStrategy);
        return "finished...";
    }

    @Override
    public String refused() {
        return "finished...";
    }

    @Override
    public String canceled() {
        return "finished...";
    }
    
}
