package com.example.demo.service.impl.statemode;

import com.example.demo.component.statemode.Context;
import com.example.demo.service.State;
import org.springframework.stereotype.Service;

/**
 * 待支付
 */
@Service
public class PendingPaymentState implements State {
    @Override
    public void action(Context context) {
        context.setState(new WaitOutStockState());
    }

    @Override
    public void doPrint() {
        System.out.println("处理待付款状态的逻辑");
    }
}
