package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.component.strategymode.PromotionClient;
import com.example.demo.dto.PromotionDto;
import com.example.demo.type.PromotionTypeEnum;
import com.example.demo.util.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromotionController {

    @Autowired
    private PromotionClient promotionClient;

    @RequestMapping(value = "/test-promotion", method = RequestMethod.GET)
    public void testPromotion() {
        PromotionDto promotionDto = new PromotionDto();
        promotionDto.setTag("1");
        promotionDto.setRemark("满减");
        promotionClient.doHandle("1", promotionDto);

        promotionDto.setTag("2");
        promotionDto.setRemark("组合");
        promotionClient.doHandle(PromotionTypeEnum.PROMOTION_GROUP.getValue(), promotionDto);
    }

}
