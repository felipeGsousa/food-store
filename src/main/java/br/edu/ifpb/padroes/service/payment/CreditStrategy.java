package br.edu.ifpb.padroes.service.payment;

public class CreditStrategy implements PaymentStrategy{

    @Override
    public void payment() {
        System.out.println("Do credit card payment!");
    }
    
}
