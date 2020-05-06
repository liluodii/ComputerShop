package com.example.computershop;

public class Accessories {
    String Price,name,modelno,connectivity,compability,color,rating;
    Integer Aimage,star;

    public Accessories(String price, String name, String modelno, String connectivity, String compability, String color, String rating, Integer aimage, Integer star) {
        Price = price;
        this.name = name;
        this.modelno = modelno;
        this.connectivity = connectivity;
        this.compability = compability;
        this.color = color;
        this.rating = rating;
        Aimage = aimage;
        this.star = star;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getCompability() {
        return compability;
    }

    public void setCompability(String compability) {
        this.compability = compability;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Integer getAimage() {
        return Aimage;
    }

    public void setAimage(Integer aimage) {
        Aimage = aimage;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }
}
