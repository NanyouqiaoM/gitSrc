package com.xiyu.demob;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("democ")
public interface CServiceFeignClient {
    @GetMapping("/c")
    String methodC();
}
