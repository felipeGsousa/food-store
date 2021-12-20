package br.edu.ifpb.padroes.service.order;

import java.lang.reflect.Method;

import br.edu.ifpb.padroes.domain.Order;


public abstract class OrderStates {

    private Order order;

    protected OrderStates(Order order){
        this.order = order;
    }
    
    public abstract String inProgress();
    public abstract String finished();
    public abstract String refused();
    public abstract String canceled();

}
