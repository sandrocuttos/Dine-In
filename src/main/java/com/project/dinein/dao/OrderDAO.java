package com.project.dinein.dao;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Order;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderDAO {

    int insertOrder(int id, Order order);

    default int insertOrder(Order order){
        int id = (int) Math.random() * 100;
        return insertOrder(id,order);
    }

    List<Order> selectAllOrders();

    int deleteOrderById(int id);

    int updateOrderById(int id, Order order);

    Optional<Order> selectOrderById(int id);
}
