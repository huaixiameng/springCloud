package com.springcloud.service;

import com.springcloud.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@ComponentScan
@FeignClient(value ="mcroservice-payment")//使用Feign
public interface PaymentService {
    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id);

}