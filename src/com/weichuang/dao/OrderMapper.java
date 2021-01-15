package com.weichuang.dao;

import com.weichuang.pojo.Order;

import java.util.List;

public interface OrderMapper {
    Order getOrderById(int i);

    int insertOrder(Order order);

    List<Order> getAllOrders();
}
