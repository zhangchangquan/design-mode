package com.example.demo.service.impl;

import com.example.demo.component.Context;
import com.example.demo.service.State;
import org.springframework.stereotype.Service;

/**
 * 待出库
 */
@Service
public class WaitOutStockState implements State {
    @Override
    public void action(Context context) {
        context.setState(new PendingDeliveryOrder());
    }

    @Override
    public void doPrint() {
        System.out.println("等待出库状态");
    }
}
