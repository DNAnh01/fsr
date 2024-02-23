package com.dnanh01.service;

import java.time.LocalDate;

import com.dnanh01.dao.JdbcOrderDao;
import com.dnanh01.dao.OrderDao;

public class OrderServiceImplement implements OrderService {

    private OrderDao orderDao;

    public OrderServiceImplement() {
        orderDao = new JdbcOrderDao();
    }

    @Override
    public void update(LocalDate localDate, double deliveryFree) {
        orderDao.update(localDate, deliveryFree);
    }
}
