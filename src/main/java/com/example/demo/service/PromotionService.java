package com.example.demo.service;

import com.example.demo.dto.PromotionDto;
import com.example.demo.type.PromotionTypeEnum;

public interface PromotionService {

    void process(PromotionDto promotionDto);

    PromotionTypeEnum getType();
}
