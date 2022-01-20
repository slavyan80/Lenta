package ru.Shop;

public class Basket {

    private int quantity;

    public Basket() {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
        System.out.println("количество товара в корзине");
    }
   public static void putInBasket() {
        Basket basket = new Basket();
    }

}
