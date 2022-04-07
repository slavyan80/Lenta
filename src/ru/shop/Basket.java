package ru.shop;

import ru.Product.Product;

public abstract class Basket {

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
        Basket basket = new Basket() {
            @Override
            protected void addProduct(Product p) {
            }
            @Override
            public Object[] getProducts() {
                return new Object[0];
            }
        };
    }

    protected abstract void addProduct(Product p);
    public abstract Object[] getProducts();

}
