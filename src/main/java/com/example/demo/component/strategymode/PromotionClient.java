package com.example.demo.component.strategymode;

import com.example.demo.component.strategymode.PromotionBeanHelper;
import com.example.demo.dto.PromotionDto;
import com.example.demo.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class PromotionClient {

    @Autowired
    private PromotionBeanHelper promotionBeanHelper;

    private Map<String, PromotionService> hashMap = new ConcurrentHashMap<>();

    @Bean
    public void getBeansMap() {
        Map<String, PromotionService> beansOfType = promotionBeanHelper.getBeansOfType(PromotionService.class);
        for (Map.Entry<String, PromotionService> map : beansOfType.entrySet()) {
            hashMap.put(map.getValue().getType().getValue(), map.getValue());
        }
    }

    public void doHandle(String value, PromotionDto promotionDto) {
        hashMap.get(value).process(promotionDto);
    }

}
