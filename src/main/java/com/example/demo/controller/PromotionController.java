package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.component.PromotionClient;
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

    public static void main(String[] args) {
       /* try {
            JSONObject header = new JSONObject();
            // 注册账号名
            header.put("username", "zhang154451");
            // 注册密码
            header.put("password", "Aa123456wn");
            // 申请到的token值
            header.put("token", "ce41e3d888ee651c1246aa1a06441234");
            // 注册百度统计方式百度站长是1，百度凤巢是2，百度联盟是3，百度哥伦布是4.
            header.put("account_type", "1");
            // 获得站点列表
            String urlStr = "https://api.baidu.com/json/tongji/v1/ReportService/getSiteList";
            String charset = "utf-8";

            JSONObject params = new JSONObject();
            params.put("header",header );

            byte[] res = HttpUtils.post(urlStr, params.toString(), charset);
            String s = new String(res);
            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        try {
            JSONObject header = new JSONObject();
            // 注册账号名
            header.put("username", "zhang154451");
            // 注册密码
            header.put("password", "Aa123456wn");
            // 申请到的token值
            header.put("token", "ce41e3d888ee651c1246aa1a06441234");
            // 注册百度统计方式百度站长是1，百度凤巢是2，百度联盟是3，百度哥伦布是4.
            header.put("account_type", "1");

            String urlStr = "https://api.baidu.com/json/tongji/v1/ReportService/getData";
            String charset = "utf-8";

            JSONObject body = new JSONObject();
            // 获取的站点id
            body.put("siteId", "16208552");
            //需要获取的数据，overview/getTimeTrendRpt网站概况（趋势数据）
            body.put("method","overview/getTimeTrendRpt");
            // 开始时间，结束时间
            body.put("start_date", "20200114");
            body.put("end_date", "20200114");
            //指标，数据单位 visitor_count访问数(UV)avg_visit_time平均访问时长，秒
            body.put("metrics", "visitor_count,avg_visit_time");

            JSONObject params = new JSONObject();
            params.put("header",header );
            params.put("body", body);

            byte[] res = HttpUtils.post(urlStr, params.toString(), charset);
            String s = new String(res);
            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
