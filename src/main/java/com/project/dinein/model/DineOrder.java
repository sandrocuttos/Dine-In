package com.project.dinein.model;

import java.util.List;
import java.util.UUID;

public class DineOrder {

    private final int orderid;

    private final String orderName;

    public int getOrderid() {
        return orderid;
    }

    public String getOrderName() {
        return orderName;
    }

    public int getOrderer() {
        return personId;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    private final int personId;

    private final List<Dish> dishes;

    public int getTotal_amt() {
        return total_amt;
    }

    private final int total_amt;

    public DineOrder(int orderid, String orderName, int personId, List<Dish> dishes, int total_amt) {
        this.orderid = orderid;
        this.orderName = orderName;
        this.personId = personId;
        this.dishes = dishes;
        this.total_amt = total_amt;
    }


}
