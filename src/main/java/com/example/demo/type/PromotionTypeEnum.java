package com.example.demo.type;

import java.util.Arrays;

public enum PromotionTypeEnum {

    /**
     * 满减Full reduction
     */
    PROMOTION_FULL_REDUCTION("1", "满减"),
    /**
     * 组合
     */
    PROMOTION_GROUP("2", "组合"),
    /**
     * 手机限时购
     */
    PROMOTION_MOBILE_TIME_LIMIT_BUY("3", "手机限时购"),
    /**
     * 秒杀
     */
    PROMOTION_SECKILL("4", "秒杀"),
    /**
     * 聚合
     */
    PROMOTION_POLYMERIZATION("5", "聚合"),


    /**
     * 新人专享活动
     */
    PROMOTION_NEW_PERSON("6", "新人专享活动"),

    /**
     * 拼团
     */
    PROMOTION_GROUP_BOOKING("7", "拼团");

    private final String value;

    private final String description;

    PromotionTypeEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

    public static PromotionTypeEnum of(String value) {
        return Arrays.stream(PromotionTypeEnum.values()).filter(element -> element.value.equals(value)).findFirst().orElse(null);
    }

}
