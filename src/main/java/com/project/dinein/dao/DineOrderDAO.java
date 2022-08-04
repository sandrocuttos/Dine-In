package com.project.dinein.dao;

import com.project.dinein.model.DineOrder;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public interface DineOrderDAO {

    int insertOrder(int id,DineOrder dineOrder);

    default int insertOrder(DineOrder dineOrder){
        Random random = new Random();
        int id = random.nextInt();
        return insertOrder(id, dineOrder);
    }

    List<DineOrder> selectAllOrders();

    int deleteOrderById(int id);

    int updateOrderById(int id, DineOrder dineOrder);

    Optional<DineOrder> selectOrderById(int id);
}
