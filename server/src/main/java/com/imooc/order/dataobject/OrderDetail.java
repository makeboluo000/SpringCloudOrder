package com.imooc.order.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    // 订单id
    private String orderId;

    // 商品id
    private String productId;

    // 商品名称
    private String productName;

    // 当前价格,单位分
    private BigDecimal productPrice;

    // 商品数量
    private Integer productQuantity;

    // 小图
    private String productIcon;


    public OrderDetail() {

    }
}
