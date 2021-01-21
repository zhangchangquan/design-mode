package com.example.demo.service.impl.strategymode;

import com.example.demo.dto.PromotionDto;
import com.example.demo.service.PromotionService;
import com.example.demo.type.PromotionTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class PromotionGroupServiceImpl implements PromotionService {

    public void process(PromotionDto promotionDto) {
        System.out.println("我是活动组合");
    }

    @Override
    public PromotionTypeEnum getType() {
        return PromotionTypeEnum.PROMOTION_GROUP;
    }
}
