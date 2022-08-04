package com.project.dinein.dao;

import com.project.dinein.model.DineOrder;
import com.project.dinein.model.Person;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DineOrderDAOImpl implements DineOrderDAO{

    private static List<DineOrder> DBOrder = new ArrayList<>();


    @Override
    public int insertOrder(int id, DineOrder dineOrder) {
        DBOrder.add(
                new DineOrder(id,dineOrder.getOrderName(),
                        dineOrder.getOrderer(),dineOrder.getDishes(), dineOrder.getTotal_amt()
                    )
        );
        return 0;
    }

    @Override
    public int insertOrder(DineOrder dineOrder) {
        return DineOrderDAO.super.insertOrder(dineOrder);
    }

    @Override
    public List<DineOrder> selectAllOrders() {
        return DBOrder;
    }

    @Override
    public int deleteOrderById(int id) {
        Optional<DineOrder> orderMaybe = selectOrderById(id);
        if (orderMaybe.isEmpty()){
            return 0;
        }
        DBOrder.remove(orderMaybe.get());
        return 1;
    }

    @Override
    public int updateOrderById(int id, DineOrder dineOrder) {
        return selectOrderById(id).map(o->{
            int index = DBOrder.indexOf(dineOrder);
            if(index >=0){
                DBOrder.set(index,dineOrder);
                return  1;
            }
            return 0;
        }).orElse(0);
    }

    @Override
    public Optional<DineOrder> selectOrderById(int id) {
        return DBOrder.stream().filter(dineOrder -> dineOrder.getOrderid()==id).findFirst();

    }
}
