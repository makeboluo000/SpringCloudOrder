package com.imooc.order.message;

import com.imooc.order.util.JsonUtil;
import com.imooc.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductInfoReceiver {

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String msg) {
        ProductInfoOutput productInfo = (ProductInfoOutput)JsonUtil.fromJson(msg, ProductInfoOutput.class);
        log.info("从队列【{}】接收到消息{}", "productInfo", productInfo);

        // 存储redis

    }
}
