package com.example.demo.controller;

import com.example.demo.service.Template;
import com.example.demo.service.impl.template.ConcreteClass_BaoCai;
import com.example.demo.service.impl.template.ConcreteClass_CaiXin;
import org.springframework.stereotype.Controller;

@Controller
public class templatePatternController {

    public static void main(String[] args) {
        Template baoCai = new ConcreteClass_BaoCai();
        baoCai.pourOil("倒油");
        baoCai.HeatOil();
        baoCai.pourVegetable();
        baoCai.pourSauce();
        baoCai.fry();

        Template caiXin = new ConcreteClass_CaiXin();
        caiXin.pourOil("倒油1");
        caiXin.HeatOil();
        caiXin.pourVegetable();
        caiXin.pourSauce();
        caiXin.fry();
    }


}
