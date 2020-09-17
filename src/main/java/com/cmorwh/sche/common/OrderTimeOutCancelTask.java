package com.cmorwh.sche.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created on 2020/9/14 18:11 with IDEA
 * author: wh
 * Description:
 */
@Component
public class OrderTimeOutCancelTask {
    private Logger LOGGER = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);
    /**
     * cron表达式：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 每10分钟扫描一次，扫描设定超时时间之前下的订单，如果没支付则取消该订单
     */
    @Scheduled(cron = "0 0/30 * * * ?")
    private void cancelTimeOutOrder() {
        // TODO: 2019/5/3 此处应调用取消订单的方法，具体查看mall项目源码

        //取消订单

        LOGGER.info("取消订单，并根据sku编号释放锁定库存");
    }
}