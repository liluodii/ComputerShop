package com.example.computershop;

public class Order {
    Integer itemimage,orderid;
    String itemname,price;

    public Order(Integer itemimage, Integer orderid, String itemname, String price) {
        this.itemimage = itemimage;
        this.orderid = orderid;
        this.itemname = itemname;
        this.price = price;
    }

    public Integer getImage() {
        return itemimage;
    }

    public void setImage(Integer image) {
        this.itemimage = image;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
