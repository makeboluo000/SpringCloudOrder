package com.imooc.order.dto;

import lombok.Data;
import lombok.Getter;

/**
 * 购物车
 */
@Data
public class CartDTO {

    // 商品id
    private String productId;

    // 数量
    private Integer productQuantity;

    // 防止@Data 远程调用序列化失败
    public CartDTO(){}

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}
