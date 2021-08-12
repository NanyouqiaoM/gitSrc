package com.xiyu.demob;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemobController {
    @Resource
    private CServiceFeignClient cService;

    @GetMapping("/b")
    @ResponseBody
    public String methodB() {
        String result = cService.methodC();
        result = " -> Service B" + result;
        return result;
    }
}
