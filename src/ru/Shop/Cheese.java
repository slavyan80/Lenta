package ru.Shop;

public class Cheese extends Product{
    private String name;
    private float price;

    public Cheese(int packaging) {
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
