package com.example.demo.service.impl.strategymode;

import com.example.demo.dto.PromotionDto;
import com.example.demo.service.PromotionService;
import com.example.demo.type.PromotionTypeEnum;
import org.springframework.stereotype.Component;

@Component
public class FullReductionServiceImpl implements PromotionService {
    @Override
    public void process(PromotionDto promotionDto) {
        System.out.println("我是满减活动");
    }

    @Override
    public PromotionTypeEnum getType() {
        return PromotionTypeEnum.PROMOTION_FULL_REDUCTION;
    }
}
