package com.example.demo.component;

import com.example.demo.service.State;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void action() {
        this.state.action(this);
    }

    public  void printInfo() {
        if (this.state != null) {
            this.state.doPrint();
        }
    }


}
