package ru.Shop;

public class Sauce extends Product {
    private String name;
    private float price;

    public Sauce(long pot) {
        super(pot);
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
