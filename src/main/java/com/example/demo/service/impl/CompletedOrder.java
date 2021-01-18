package com.example.demo.service.impl;

import com.example.demo.component.Context;
import com.example.demo.service.State;
import org.springframework.stereotype.Service;

/**
 * 订单完成
 */
@Service
public class CompletedOrder implements State {
    @Override
    public void action(Context context) {
        context.setState(null);
    }

    @Override
    public void doPrint() {
        System.out.println("订单完成状态");
    }
}
