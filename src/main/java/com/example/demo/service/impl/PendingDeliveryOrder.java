package com.example.demo.service.impl;

import com.example.demo.component.Context;
import com.example.demo.service.State;
import org.springframework.stereotype.Service;


/**
 * 待收货
 */
@Service
public class PendingDeliveryOrder implements State {
    @Override
    public void action(Context context) {
        context.setState(new PendingEvaluation());
    }

    @Override
    public void doPrint() {
        System.out.println("待收货状态");
    }
}
