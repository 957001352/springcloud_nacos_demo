package com.gchen.demo.controller;

import com.gchen.commons.domain.Result;
import com.gchen.commons.utils.ResultUtils;
import com.gchen.shiro.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
@RefreshScope
public class DemoController {

    @Autowired
    private RedisService redisService;

    @GetMapping("/test")
    public Result hello() {
        redisService.set("123",123);
        return ResultUtils.success( "Hello:+" + redisService.get("123"));
    }
}
