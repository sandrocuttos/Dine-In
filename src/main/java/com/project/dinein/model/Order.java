package com.project.dinein.model;

import java.util.List;
import java.util.UUID;

public class Order {

    private final UUID orderid;

    private final String orderName;

    private final Person orderer;

    private final List<Dish> dishes;

    public Order(UUID orderid, String orderName, Person orderer, List<Dish> dishes) {
        this.orderid = orderid;
        this.orderName = orderName;
        this.orderer = orderer;
        this.dishes = dishes;
    }


}
