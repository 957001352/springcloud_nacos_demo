package com.gchen.demo.controller;

import com.gchen.commons.domain.Result;
import com.gchen.commons.utils.ResultUtils;
import com.gchen.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;
    @GetMapping("/test")
    public Result test(){
        return demoService.test();
    }
}
