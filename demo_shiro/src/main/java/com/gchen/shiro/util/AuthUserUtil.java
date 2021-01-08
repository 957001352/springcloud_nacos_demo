package com.gchen.shiro.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gchen.shiro.service.RedisService;
import com.gchen.commons.systemconst.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author lpsong
 * @Date 2020/4/24
 */
@Component
public class AuthUserUtil {
    @Autowired
    private RedisService redisService;
    @Autowired
    private HttpServletRequest request;

    public JSONObject currentUser() {
        String token = request.getHeader(Const.TOKEN_HEADER);
        String obj= (String) redisService.get(Const.TOKEN_CACHE_ITEM_PREFIX + token);
        if(obj!=null){
            return JSON.parseObject(obj);
        }
        return null;
    }

    public Integer tenantId() {
        JSONObject user=this.currentUser();
        if(user!=null){
            return (Integer) user.get("tenantId");
        }
        return null;
    }
    public Integer userId() {
        JSONObject user=this.currentUser();
        if(user!=null){
            return (Integer) user.get("id");
        }
        return null;
    }
}