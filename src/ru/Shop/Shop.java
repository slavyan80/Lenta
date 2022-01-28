package ru.Shop;

import ru.Product.Cheese;
import ru.Product.Pasta;
import ru.Product.Sauce;
import ru.Shop.Buyer.Man;
import ru.Shop.Buyer.Woman;
import ru.Shop.Service.Delivery;
import ru.Shop.Service.Pickup;
import ru.Shop.Service.Service;

import static ru.Shop.ProductSelection.*;

public class Shop implements ProductSelection {


    public static void main(String[] args) {
        MBuyer man = new MBuyer();
        WBuyer woman = new WBuyer();
        Shelf shelf = new Shelf();
        Basket.putInBasket();
        Delivery delivery = new Delivery();
        Pickup pickup = new Pickup();
        CashBox cashBox = new CashBox();
        Man.Buyer(man);
        Woman.Buyer(woman);

        Pasta pasta = new Pasta(10);
        Pasta pasta1 = new Pasta(2);
        Pasta pasta3 = new Pasta(1);
        Pasta.soldProduct(pasta);

        Sauce sauce = new Sauce(15);
        Sauce sauce1 = new Sauce(2);
        Sauce.soldProduct(sauce);
        
        Cheese cheese = new Cheese(20);
        Cheese cheese1 = new Cheese(2);
        Cheese.soldProduct(cheese);
        System.out.println("----------------");
        productSelectionMBuyer(man, pasta, pasta1, sauce1);
        Shelf.productOnTheShelf(shelf, pasta, pasta1, sauce, sauce1);
        man.take();
        Service.deliveryMBuyer(man, delivery, pickup);
        CashBox.oplataTovaraMBuyer(cashBox, pasta, pasta1, sauce, sauce1);
        System.out.println("----------------");
        productSelectionWBuyer(woman, pasta, pasta3, cheese1);
        Shelf.productOnTheShelf(shelf, pasta, pasta1, pasta3, cheese, cheese1);
        woman.take();
        Service.deliveryWBuyer(woman, delivery, pickup);
        CashBox.oplataTovaraWBuyer(cashBox, pasta, pasta3, cheese, cheese1);
        
    }


}






