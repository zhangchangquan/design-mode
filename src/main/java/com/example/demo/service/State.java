package com.example.demo.service;

import com.example.demo.component.statemode.Context;

public interface State {

    void action(Context context);

    void doPrint();
}
