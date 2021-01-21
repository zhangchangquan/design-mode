package com.example.demo.service.impl.statemode;

import com.example.demo.component.statemode.Context;
import com.example.demo.service.State;
import com.example.demo.service.impl.statemode.CompletedOrder;
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
