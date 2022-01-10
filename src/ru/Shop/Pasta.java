package ru.Shop;

public class Pasta extends Product {
    private String name;
    private float price;


    public Pasta(int packaging) {
        super(packaging);
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
