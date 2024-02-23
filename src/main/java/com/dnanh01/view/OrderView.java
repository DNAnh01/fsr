package com.dnanh01.view;

import java.time.LocalDate;

import com.dnanh01.service.OrderService;
import com.dnanh01.service.OrderServiceImplement;

public class OrderView {
    private static OrderService orderService;

    static {
        orderService = new OrderServiceImplement();
    }

    public static void main(String[] args) {
        LocalDate deliveryDate = LocalDate.of(2020, 12, 18);
        double deliveryFree = 11;
        orderService.update(deliveryDate, deliveryFree);
    }
}
