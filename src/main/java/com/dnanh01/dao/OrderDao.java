package com.dnanh01.dao;

import java.time.LocalDate;

public interface OrderDao {
    void update(LocalDate localDate, double deliveryFree);
}
