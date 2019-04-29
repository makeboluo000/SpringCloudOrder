package com.imooc.order.controller;

import com.imooc.order.client.ProductClient;
import com.imooc.order.dto.CartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class ClientController {

/*  以下模拟RestTempplate调用远程服务方法
    @Autowired
    private LoadBalancerClient loadBalancerClient;

//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        // 第一种方式调用(直接使用RestTemplate url 写死)
//        RestTemplate restTemplate = new RestTemplate();
//        String res = restTemplate.getForObject("http://localhost:8080/msg", String.class);

        // 第二种方式(利用 loadBalanceClient 通过应用名获取url,然后在使用RestTemplate)
        RestTemplate restTemplate = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort());
        String res = restTemplate.getForObject(url, String.class);

        // 第三种方式(利用@LoadBalanced, 可在restTemplate里使用应用的名字)
//        String res = restTemplate.getForObject("http://PRODUCT/msg", String.class);

        log.info("reponse={}", res);
        return res;
    }*/

//    @Autowired
//    private ProductClient productClient;
//
//    @GetMapping("/getProductMsg")
//    public String getProductMsg() {
//        String res = productClient.productMsg();
//        log.info("reponse={}", res);
//        return res;
//    }
//
//    @GetMapping("/getProductList")
//    public String getProductList() {
//        List<ProductInfo> list = productClient.listForOrder(Arrays.asList("164103465734242707"));
//        log.info("reponse={}", list);
//        return "ok";
//    }
//
//    @GetMapping("/productDecreaseStock")
//    public String productDecreaseStock() {
//        productClient.decreaseStock(Arrays.asList(new CartDTO("164103465734242707", 2)));
//        return "ok";
//    }

}
