package com.androidfree.myapplication.Model;

public class Selectservice {
    private String item_text_name;
    private String[] select_spinner_item;
    private String item_price;
    private int service_image;

    public Selectservice(String item_text_name, String[] select_spinner_item, String item_price, int service_image) {
        this.item_text_name = item_text_name;
        this.select_spinner_item = select_spinner_item;
        this.item_price = item_price;
        this.service_image = service_image;
    }

    public String getItem_text_name() {
        return item_text_name;
    }

    public void setItem_text_name(String item_text_name) {
        this.item_text_name = item_text_name;
    }

    public String[] getSelect_spinner_item() {
        return select_spinner_item;
    }


    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public int getService_image() {
        return service_image;
    }

    public void setService_image(int service_image) {
        this.service_image = service_image;
    }
}


