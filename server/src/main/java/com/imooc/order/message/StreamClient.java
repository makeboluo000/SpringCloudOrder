package com.imooc.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamClient {

    @Input("myMsgIn")
    SubscribableChannel input();

    @Output("myMsgOut")
    MessageChannel output();

    @Input("myMsgIn2")
    SubscribableChannel input2();

    @Output("myMsgOut2")
    MessageChannel output2();

}
