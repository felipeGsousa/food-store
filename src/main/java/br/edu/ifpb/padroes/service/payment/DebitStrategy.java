package br.edu.ifpb.padroes.service.payment;

public class DebitStrategy implements PaymentStrategy{

    @Override
    public void payment() {
        System.out.println("Do debit payment!");
    }

}

