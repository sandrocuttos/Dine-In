package com.project.dinein.dao;

import com.project.dinein.model.DineOrder;

import java.util.List;
import java.util.Optional;

public interface DineOrderDAO {

    int insertOrder(int id,DineOrder dineOrder);

    default int insertOrder(DineOrder dineOrder){
        int id = (int)Math.random();
        return insertOrder(id, dineOrder);
    }

    List<DineOrder> selectAllOrders();

    int deleteOrderById(int id);

    int updateOrderById(int id, DineOrder dineOrder);

    Optional<DineOrder> selectOrderById(int id);
}
