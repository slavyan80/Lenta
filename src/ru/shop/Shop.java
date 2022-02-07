package ru.shop;

import ru.Product.Cheese;
import ru.Product.Pasta;
import ru.Product.Product;
import ru.Product.Sauce;
import ru.shop.Buyer.Man;
import ru.shop.Buyer.Woman;
import ru.shop.service.Delivery;
import ru.shop.service.Pickup;
import ru.shop.service.Service;
import ru.shop.service.ServiceShop;

import java.util.Random;

import static ru.shop.ProductSelection.*;

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

        Pasta pasta = new Pasta();
        Pasta pasta1 = new Pasta();
        Pasta pasta3 = new Pasta();
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
        ServiceShop s = new ServiceShop();
        Basket wBasket = new BasketOnSet();
        for (int i = 0; i < 5; i++) {
            wBasket.addProduct(selectAnyProduct());
        }

        for (int i = 0; i < wBasket.getProducts().length; i++)
            System.out.println("Index: " + i + " Product: " + wBasket.getProducts()[i]);

    }


     private static Product selectAnyProduct() {
         Random r = new Random();
        int i = r.nextInt(3);
        if (i % 2 == 0) {
            return new Pasta();
        }
         return new Cheese();
    }

}






