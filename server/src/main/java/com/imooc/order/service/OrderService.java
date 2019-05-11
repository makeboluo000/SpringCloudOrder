package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

public interface OrderService {

    // 创建订单
    OrderDTO create(OrderDTO orderDTO);

    // 完结订单
    OrderDTO finish(String orderId);

}
