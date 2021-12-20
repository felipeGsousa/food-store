package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;

public class OrderRefused extends OrderStates{

    protected OrderRefused(Order order) {
        super(order);
    }


    @Override
    public String inProgress() {
        return "refused...";
    }

    @Override
    public String finished() {
        return "refused...";
    }

    @Override
    public String refused() {
        return "refused...";
    }

    @Override
    public String canceled() {
        return "refused...";
    }
    
}
