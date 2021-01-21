package com.example.demo.service.impl.template;

import com.example.demo.service.Template;

public class ConcreteClass_CaiXin extends Template {

    @Override
    public void  pourVegetable(){
        System.out.println("下锅的蔬菜是菜心");
    }
    @Override
    public void  pourSauce(){
        System.out.println("下锅的酱料是蒜蓉");
    }
}
