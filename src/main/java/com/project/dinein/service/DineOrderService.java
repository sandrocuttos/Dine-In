package com.project.dinein.service;

import com.project.dinein.dao.DineOrderDAO;
import com.project.dinein.model.DineOrder;
import com.project.dinein.model.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public List<Dish> getAllDishes (DineOrder order){



    }
}
