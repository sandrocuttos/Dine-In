package com.project.dinein.service;

import com.project.dinein.dao.DineOrderDAO;
import com.project.dinein.model.DineOrder;
import org.springframework.beans.factory.annotation.Autowired;

public class DineOrderService {

    private final DineOrderDAO dineOrderDAO;


    DishService dishService;

    @Autowired
    public DineOrderService(DineOrderDAO dineOrderDAO) {
        this.dineOrderDAO = dineOrderDAO;
    }

    public int createOrder (DineOrder order){

        return dineOrderDAO.insertOrder(order);
    }
}
