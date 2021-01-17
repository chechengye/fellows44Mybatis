package com.weichuang.dao;

import com.weichuang.pojo.Order;
import com.weichuang.pojo.OrderAndUser;

import java.util.List;

public interface OrderMapper {
    Order getOrderById(int i);

    int insertOrder(Order order);

    List<Order> getAllOrders();

    List<OrderAndUser> getAllOrderAndUser();

    List<Order> getOrders();
}
