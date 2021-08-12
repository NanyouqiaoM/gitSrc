package com.xiyu.demoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private BServiceFeignClient bService;
    @GetMapping("/a")
    public String methodA(){
        String result = bService.methodB();
        result = "-> Service A" + result;
        return result;
    }
}
