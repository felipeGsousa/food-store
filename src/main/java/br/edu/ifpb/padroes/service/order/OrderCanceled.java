package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;

public class OrderCanceled extends OrderStates{

    protected OrderCanceled(Order order) {
        super(order);
    }


    @Override
    public String inProgress() {
        return "canceled...";
    }

    @Override
    public String finished() {
        return "canceled...";
    }

    @Override
    public String refused() {
        return "canceled...";
    }

    @Override
    public String canceled() {
        return "canceled...";
    }
    
}
