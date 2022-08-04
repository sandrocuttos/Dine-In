package com.project.dinein.api;

import com.project.dinein.model.DineOrder;
import com.project.dinein.service.DineOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DineOrderController {

    private final DineOrderService dineOrderService;

    @Autowired
    public DineOrderController(DineOrderService dineOrderService) {
        this.dineOrderService = dineOrderService;
    }

    @PostMapping
    public void createOrder(@RequestBody DineOrder dineOrder){
        dineOrderService.createOrder(dineOrder);
    }
}
