package com.imooc.order.message;

import com.imooc.order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

//    @StreamListener("myMsgOut")
//    public void process(Object message) {
//        log.info("StreamReceiver: {}", message);
//    }

    /**
     * Stream 接收方
     * @param message
     */
    @StreamListener(value = "myMsgOut")
    @SendTo("myMsgOut2") // 处理完后要把消息发送给MQ
    public String process(OrderDTO message) {
        log.info("StreamReceiver: {}", message);
        return "receiver";
    }

    @StreamListener(value = "myMsgOut2")
    public void process2(String message) {
        log.info("StreamReceiver2: {}", message);
    }

}
