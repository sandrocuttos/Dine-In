package com.project.dinein.dao;

import com.project.dinein.model.Dish;
import com.project.dinein.model.Order;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderDAO {

    int insertOrder(UUID id, Order order);

    default int insertOrder(Order order){
        UUID id = UUID.randomUUID();
        return insertOrder(id,order);
    }

    List<Order> selectAllOrders();

    int deleteOrderById(UUID id);

    int updateOrderById(UUID id, Order order);

    Optional<Order> selectOrderById(UUID id);
}
