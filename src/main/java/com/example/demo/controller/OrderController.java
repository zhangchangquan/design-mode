package com.example.demo.controller;

import com.example.demo.component.Context;
import com.example.demo.service.State;
import com.example.demo.service.impl.PendingPaymentState;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    public static void main(String[] args) {

        State orderState = new PendingPaymentState();
        Context context = new Context(orderState);
        context.printInfo();

        // 用户付款
        context.action();
        context.printInfo();

        // 商家出库发货
        context.action();
        context.printInfo();

        // 用户签收
        context.action();
        context.printInfo();

        // 用户评价
        context.action();
        context.printInfo();


    }
}
