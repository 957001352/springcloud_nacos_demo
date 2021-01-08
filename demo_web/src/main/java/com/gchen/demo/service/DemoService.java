package com.gchen.demo.service;

import com.gchen.commons.domain.Result;
import com.gchen.demo.service.fbk.DemoServiceFbk;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "demo-service/demo",fallback = DemoServiceFbk.class)
public interface DemoService {
    @GetMapping("/test")
    Result test();
}
