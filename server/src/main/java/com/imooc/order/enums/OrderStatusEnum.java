package com.imooc.order.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2 , "已取消")
    ;

    private Integer code;
    private String name;

    OrderStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

}
