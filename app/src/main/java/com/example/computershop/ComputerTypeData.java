package com.example.computershop;

public class ComputerTypeData {

    String Cname,model,price,rating,Display,memory,os,videocard,wireless,keyboard,mouse,harddrive;
    Integer Cimage,Star;

    public ComputerTypeData(String cname, String model, String price, String rating, String display, String memory, String os, String videocard, String wireless, String keyboard, String mouse, String harddrive, Integer cimage, Integer star) {
        Cname = cname;
        this.model = model;
        this.price = price;
        this.rating = rating;
        Display = display;
        this.memory = memory;
        this.os = os;
        this.videocard = videocard;
        this.wireless = wireless;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.harddrive = harddrive;
        this.Cimage = cimage;
        this.Star = star;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String display) {
        Display = display;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getWireless() {
        return wireless;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getHarddrive() {
        return harddrive;
    }

    public void setHarddrive(String harddrive) {
        this.harddrive = harddrive;
    }

    public Integer getCimage() {
        return Cimage;
    }

    public void setCimage(Integer cimage) {
        Cimage = cimage;
    }

    public Integer getStar() {
        return Star;
    }

    public void setStar(Integer star) {
        Star = star;
    }
}
