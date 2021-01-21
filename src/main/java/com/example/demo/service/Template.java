package com.example.demo.service;

public abstract class Template {


    //定义结构里哪些方法是所有过程都是一样的可复用的，哪些是需要子类进行实现的

    //第一步：倒油是一样的，所以直接实现
    public void pourOil(String str){
        System.out.println(str);
    }

    //第二步：热油是一样的，所以直接实现
    public void  HeatOil(){
        System.out.println("热油");
    }

    //第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
//所以声明为抽象方法，具体由子类实现
    public abstract void  pourVegetable();

    //第四步：倒调味料是不一样的（一个下辣椒，一个是下蒜蓉）
//所以声明为抽象方法，具体由子类实现
    public abstract void  pourSauce();


    //第五步：翻炒是一样的，所以直接实现
    public void fry(){
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
