package ru.payment;

import ru.Product.Cheese;
import ru.Product.Pasta;
import ru.Product.Sauce;
import ru.shop.CashBox;

import java.util.Scanner;

public class PaymentProduct {

    public static void oplataTovaraWBuyer(CashBox cashBox, Pasta pasta, Pasta pasta3, Cheese cheese, Cheese cheese1) {
        // System.out.println(pasta.getPrice() * pasta3.getPackaging() + cheese.getPrice() * cheese1.getPackaging() + "руб.");
        cashBox.givecheckPrice();
        System.out.println("Макароны" + " " + pasta3.getPackaging() + " упаковки" + ": " + pasta.getPrice() * pasta3.getPackaging() + " " + "руб.");
        System.out.println("Сыр" + " " + cheese1.getPackaging() + " упаковки" + ": " + cheese.getPrice() * cheese1.getPackaging() + " " + "руб.");
        System.out.println("итого" + ": " + (pasta.getPrice() * pasta3.getPackaging() + cheese.getPrice() * cheese1.getPackaging()) + " " + "руб.");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер карты для оплаты");
        String cardNumber = sc.next();
        try {
            if (cardNumber.length() != 16) {
                throw new Exception("непрвильное количество символов:" + cardNumber.length());
            }
            System.out.println("оплатить по карте:" + cardNumber);

            System.out.println("оплатить:" + (pasta.getPrice() * pasta3.getPackaging() + cheese.getPrice() * cheese1.getPackaging()) + " " + "руб.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("повторите попытку");
        }

    }

    public static void oplataTovaraMBuyer(CashBox cashBox, Pasta pasta, Pasta pasta1, Sauce sauce, Sauce sauce1) {
        // System.out.println((pasta.getPrice() * pasta1.getPackaging()) + (sauce.getPrice() * sauce1.getPot()) + "руб.");
        cashBox.givecheckPrice();
        System.out.println("Соус" + " " + sauce1.getPot() + " банки" + ": " + sauce.getPrice() * sauce1.getPot() + " " + "руб.");
        System.out.println("Макароны" + " " + pasta1.getPackaging() + " упаковки" + ": " + pasta.getPrice() * pasta1.getPackaging() + " " + "руб.");
        System.out.println("итого:" + " " + (pasta.getPrice() * pasta1.getPackaging() + sauce.getPrice() * sauce1.getPot()) + " " + "руб.");
        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер карты");
        String cardNumber = sc.next();
        try {
            if (cardNumber.length() != 16) {
                throw new Exception("непрвильное количество символов:" + cardNumber.length());
            }
            System.out.println("оплатить по карте:" + cardNumber);

            System.out.println("оплатить:" + (pasta.getPrice() * pasta1.getPackaging() + sauce.getPrice() * sauce1.getPot()) + " " + "руб.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("повторите попытку");
        }


    }
}
