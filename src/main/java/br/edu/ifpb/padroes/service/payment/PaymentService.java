package br.edu.ifpb.padroes.service.payment;

public class PaymentService {

    public void doPayment(PaymentStrategy paymentStrategy) throws Exception {
        try{
            paymentStrategy.payment();
        }catch(Exception e){
            throw new Exception("unknown payment method");
        }
    }

}
