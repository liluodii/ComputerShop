package com.example.computershop;

public class types {

    public Integer Image,id;


    public types(Integer image,Integer id) {

        Image = image;
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}