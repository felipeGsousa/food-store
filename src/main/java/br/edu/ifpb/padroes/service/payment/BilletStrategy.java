package br.edu.ifpb.padroes.service.payment;

public class BilletStrategy implements PaymentStrategy{

    @Override
    public void payment() {
        System.out.println("Do billet payment!");
    }
    
}
