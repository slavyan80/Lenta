package ru.Shop;

public class Product {
    private int packaging;
    private long pot;
    public Product(int packaging) {
        this.packaging = packaging;

    }
    public Product(long pot) {
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


