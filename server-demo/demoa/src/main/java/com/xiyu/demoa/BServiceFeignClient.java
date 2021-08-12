package com.xiyu.demoa;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("demob")
public interface BServiceFeignClient {
    @GetMapping("/b")
    String methodB();
}
