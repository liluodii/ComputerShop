package com.example.computershop;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    private static OrderRepo instance = null;
    private List<Order> orders = new ArrayList<>();

    public OrderRepo() //constructor
    {
        orders.add(new Order(R.drawable.popcomp1,34,"Dell Inspiron 24 3000 (AMD ) Touch All-in-One Desktop - 8GB - 1TB - Windows 10 Home - di243475_ft_s1407e\",\"Inspiron 24 3000 (AMD )","$799.99"));

    }
    public static OrderRepo getInstance() //Method
    {
        if (instance == null) {
            instance = new OrderRepo();
        }
        return instance;
    }

    public void addOrder(Order order)
    {
        this.orders.add(order);
    }

    public List<Order> getorder() {
        return this.orders;
    }
}
