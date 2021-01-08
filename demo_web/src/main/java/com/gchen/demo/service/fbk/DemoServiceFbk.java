package com.gchen.demo.service.fbk;

import com.gchen.commons.domain.Result;
import com.gchen.commons.enums.ResultEnum;
import com.gchen.commons.utils.ResultUtils;
import com.gchen.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceFbk implements DemoService {
    @Override
    public Result test() {
        return ResultUtils.error(ResultEnum.NETWORK_ERR);
    }
}
