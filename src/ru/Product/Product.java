package ru.Product;


public abstract class  Product {
    private int packaging;
    private long pot;

    public Product(int packaging) {
        this.packaging = packaging;
    }

    public Product() {
        this.pot = pot;
    }

    public int getPackaging() {
        return packaging;
    }

    public void setPackaging(int packaging) {
        this.packaging = packaging;
    }

    public long getPot() {
        return pot;
    }

    public void setPot(long pot) {
        this.pot = pot;
    }



}


