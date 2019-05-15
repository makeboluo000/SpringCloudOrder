package com.imooc.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

    // 超时配置 可以放在配置文件里面
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
    // 熔断相关设置 可以放在配置文件里面
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name="circuitBreaker.enabled", value = "true"), // 是否开启熔断器
//            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value = "10"), // 请求数达到多少才进行百分比计算
//            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 半开试探休眠时间，默认值5000ms
//            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage", value = "60") //  设定错误百分比，默认值50% 达到这个错误比就进入回调函数
//    })

    @HystrixCommand
    @GetMapping("/getProductInfoList")
    public String getProductInfoList(@RequestParam("num") Integer num) {
        if(num % 2 == 0) {
            return "我还活着呢";
        }

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://127.0.0.1:8082/product/listForOrder",
                Arrays.asList("157875196366160022"),
                String.class);
    }

    private String fallback() {
        return "太拥挤了，请稍后再试！";

    }

    private String defaultFallback() {
        return "默认提示：太拥挤了，请稍后再试！";
    }

}
