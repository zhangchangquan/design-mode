package com.example.demo.service.impl.template;

import com.example.demo.service.Template;

public class ConcreteClass_BaoCai extends Template {


    @Override
    public void  pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }
    @Override
    public void  pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
