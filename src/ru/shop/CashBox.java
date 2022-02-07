package ru.shop;

import ru.Product.Cheese;
import ru.Product.Pasta;
import ru.Product.Sauce;

public class CashBox {


    public CashBox() {
    }

    public void takeMoney() {
        System.out.println("взять деньги за продукт");
    }

    public void givecheckPrice() {
        System.out.println("выдать товарный чек");
    }
    public static void oplataTovaraWBuyer(CashBox cashBox, Pasta pasta, Pasta pasta3, Cheese cheese, Cheese cheese1) {
        char[] charArray;
        String productVKorzine;
        cashBox.takeMoney();
        productVKorzine = "M.C.";
        charArray = productVKorzine.toCharArray();

        for (char selectChar : charArray) {
            switch (selectChar) {
                case 'M':
                    System.out.println("за продукт макароны");
                    break;
                case 'C':
                    System.out.println("за продукт сыр");
                    break;
                default:
                    System.out.println("оплочено");
                    break;
            }
        }
        System.out.println(pasta.getPrice() * pasta3.getPackaging() + cheese.getPrice() * cheese1.getPackaging() + "руб.");
        cashBox.givecheckPrice();
        System.out.println("Макароны" + " " + pasta3.getPackaging() + " упаковки" + ": " + pasta.getPrice() * pasta3.getPackaging() + " " + "руб.");
        System.out.println("Сыр" + " " + cheese1.getPackaging() + " упаковки" + ": " + cheese.getPrice() * cheese1.getPackaging() + " " + "руб.");
        System.out.println("итого" + ": " + (pasta.getPrice() * pasta3.getPackaging() + cheese.getPrice() * cheese1.getPackaging()) + " " + "руб.");
    }
    public static void oplataTovaraMBuyer(CashBox cashBox, Pasta pasta, Pasta pasta1, Sauce sauce, Sauce sauce1) {
        cashBox.takeMoney();
        String productVKorzine = "M.S.";
        char[] charArray = productVKorzine.toCharArray();

        for (char selectChar : charArray) {
            switch (selectChar) {
                case 'M':
                    System.out.println("за продукт макароны");
                    break;
                case 'S':
                    System.out.println("за прoдукт соус");
                    break;

                default:
                    System.out.println("оплочено");
                    break;

            }
        }
        System.out.println((pasta.getPrice() * pasta1.getPackaging()) + (sauce.getPrice() * sauce1.getPot()) + "руб.");
        cashBox.givecheckPrice();
        System.out.println("Соус" + " " + sauce1.getPot() + " банки" + ": " + sauce.getPrice() * sauce1.getPot() + " " + "руб.");
        System.out.println("Макароны" + " " + pasta1.getPackaging() + " упаковки" + ": " + pasta.getPrice() * pasta1.getPackaging() + " " + "руб.");
        System.out.println("итого:" + " " + (pasta.getPrice() * pasta1.getPackaging() + sauce.getPrice() * sauce1.getPot()) + " " + "руб.");
    }



}





