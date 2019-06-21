package com.lctech.oauthclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @GetMapping("export")
    public Object export(Principal principal){
        return principal;
    }

    @GetMapping("test")
    public Object test(){
        Map<String,Object> map = new HashMap<>();
        map.put("test","测试单点登录!");
        return map;
    }
}
