package br.edu.ifpb.padroes.service.payment;

public class PayPalStrategy implements PaymentStrategy{

    @Override
    public void payment() {
        System.out.println("Do paypal payment!");    
    }
    
}
