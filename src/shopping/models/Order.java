package shopping.models;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
    private Customer customer;
    private OrderItem[] orderItems;
    private LocalDateTime dateCreated;
    private double totalOfMoney;

    public Order() {
    }

    public Order(Customer customer, OrderItem[] orderItems, LocalDateTime dateCreated) {
        this.customer = customer;
        this.orderItems = orderItems;
        this.dateCreated = dateCreated;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getTotalOfMoney() {
        return totalOfMoney;
    }

    public void setTotalOfMoney(double totalOfMoney) {
        this.totalOfMoney = totalOfMoney;
    }

    @Override
    public String toString() {
        return "Order [customer=" + customer + ", orderItems=" + Arrays.toString(orderItems) + ", dateCreated="
                + dateCreated + ", totalOfMoney=" + totalOfMoney + "]";
    }

}
