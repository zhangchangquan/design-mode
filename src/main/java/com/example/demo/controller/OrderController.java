package com.example.demo.controller;

import com.example.demo.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    private static OrderModel orderModel;

    public static void main(String[] args) {

        orderModel.updateOrderState();


    }
}
