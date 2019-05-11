package com.imooc.order.dto;

import com.imooc.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {

    private String orderId;

    // 买家名字
    private String buyerName;

    // 买家电话
    private String  buyerPhone;

    // 买家地址
    private String  buyerAddress;

    // 买家微信openid
    private String  buyerOpenid;

    // 订单总金额
    private BigDecimal orderAmount;

    // 订单状态, 默认为新下单
    private Integer orderStatus;

    // 支付状态, 默认未支付 0
    private Integer payStatus;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;

    // 全局配置 如果为null不需要返回时，如果个别字段有约定必须要返回，
    // 那么如果是对象可以new，如果是String可以 = “”
//    List<OrderDetail> orderDetailList = new ArrayList<>();
    List<OrderDetail> orderDetailList;

}

