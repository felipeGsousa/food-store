package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;


public class OrderInProgress extends OrderStates{

    protected OrderInProgress(Order order){
        super(order);
        order.setStatus("in progress...");
    }

    @Override
    public String inProgress() {
        return "in progress...";
    }

    @Override
    public String finished() {
        return "in progress...";
    }

    @Override
    public String refused() {
        return "in progress...";
    }

    @Override
    public String canceled() {
    
        return "in progress...";
    }
    
}
