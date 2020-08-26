package com.cmorwh.sche.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by wangheng on 2020/8/19 11:30
 */

/*
@EnableSwagger2
*/
@Controller
public class ScheduController {
    private static int i =0;
    @RequestMapping(value = "/sche",method = RequestMethod.GET)
    /*@Scheduled(cron = "0/180 * * * * ?")*/
    public void scheduWork(){
        i++;
        System.out.println("第"+i+"次执行"+System.currentTimeMillis());
    }
}
