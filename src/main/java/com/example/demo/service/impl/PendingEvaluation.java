package com.example.demo.service.impl;

import com.example.demo.component.Context;
import com.example.demo.service.State;
import org.springframework.stereotype.Service;

/**
 * 待评价
 */
@Service
public class PendingEvaluation implements State {
    @Override
    public void action(Context context) {
        context.setState(new CompletedOrder());
    }

    @Override
    public void doPrint() {
        System.out.println("待评价状态");
    }
}
