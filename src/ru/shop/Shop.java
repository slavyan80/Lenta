package ru.shop;

import Seach.SearchProductM;
import Seach.SearchProductW;
import ru.Product.Cheese;
import ru.Product.Pasta;
import ru.Product.Product;
import ru.Product.Sauce;
import ru.payment.PaymentProduct;
import ru.shop.Buyer.Man;
import ru.shop.Buyer.Woman;
import ru.shop.service.Delivery;
import ru.shop.service.Pickup;
import ru.shop.service.Service;
import ru.shop.service.ServiceShop;

import java.io.IOException;
import java.util.Random;
//import static ru.shop.ProductSelection.productSelectionMBuyer;
//import static ru.shop.ProductSelection.productSelectionWBuyer;

public class Shop implements ProductSelection {

    public static void main(String[] args) throws IOException {
        // java.lang.Thread myCurrentTread = currentThread();
       // System.out.println(myCurrentTread);

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
        Pasta.soldProduct1(pasta1);
        Pasta.soldProduct2(pasta3);

        Sauce sauce = new Sauce(15);
        Sauce sauce1 = new Sauce(2);
        Sauce.soldProduct(sauce);
        Sauce.soldProduct1(sauce1);

        Cheese cheese = new Cheese(20);
        Cheese cheese1 = new Cheese(2);
        Cheese.soldProduct(cheese);
        System.out.println("----------------");

        ShopThread purchase1 = new ShopThread("первый поток");
        purchase1.start();
        System.out.println("первый поток");
        SearchProductM.searchM();
       // productSelectionMBuyer(man, pasta, pasta1, sauce1);
       // Shelf.productOnTheShelf(shelf, pasta, pasta1, sauce, sauce1);
        man.take();
        PaymentProduct.oplataTovaraMBuyer(cashBox, pasta, pasta1, sauce, sauce1);
        Service.deliveryMBuyer(man, delivery, pickup);
        System.out.printf("%s finished.\n", purchase1);
        System.out.println("----------------");
        ShopThread purchase2 = new ShopThread("второй поток");
        purchase2.start();
        System.out.println("второй поток");
        SearchProductW.searchW();
        //productSelectionWBuyer(woman, pasta, pasta3, cheese1);
        // Shelf.productOnTheShelf(shelf, pasta, pasta1, pasta3, cheese, cheese1);
        woman.take();
        PaymentProduct.oplataTovaraWBuyer(cashBox, pasta, pasta3, cheese, cheese1);
        Service.deliveryWBuyer(woman, delivery, pickup);
        System.out.printf("%s finished.\n", purchase2);
        ServiceShop s = new ServiceShop();
        Basket wBasket = new BasketOnSet();
        for (int i = 0; i < 5; i++) {
            wBasket.addProduct(selectAnyProduct());

        }

        // createFile();
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








