package ru.Shop;

import ru.Shop.Service.Delivery;
import ru.Shop.Service.Pickup;

public class Shop {


    public static void main(String[] args) {
        MBuyer man = new MBuyer();
        WBuyer woman = new WBuyer();
        Delivery delivery = new Delivery();
        Pickup pickup = new Pickup();
        CashBox cashBox = new CashBox();
        Shelf shelf = new Shelf();
        Basket basket = new Basket();
        man.setName("Покупатель: Коля, возрост:" + man.getHuman().getAge() + "лет," + " " + man.getHuman().getGender() + " " + "мужской.");
        System.out.println(man.getName());
        woman.setName("Покупатель: Юля, возрост:" + woman.getHuman().getAge() + "лет," + " " + woman.getHuman().getGender() + " " + "женский.");
        System.out.println(woman.getName());

        Pasta pasta = new Pasta(10);
        Pasta pasta1 = new Pasta(2);
        Pasta pasta3 = new Pasta(1);
        pasta.setPrice((float) 75.00);
        pasta.setName("Makfa");
        System.out.println("Макароны " + pasta.getName() + " " + "цена " + pasta.getPrice() + "руб.");
        pasta.setPackaging(5);
        System.out.println("на полке" + " " + pasta.getPackaging() + " " + "упаковок");


        Sauce sauce = new Sauce(15);
        Sauce sauce1 = new Sauce(2);
        sauce.setPrice((float) 96.60);
        sauce.setName("Bolognese");
        System.out.println("Соус " + sauce.getName() + " " + "цена " + sauce.getPrice() + "руб.");
        sauce.setPot(10);
        System.out.println("на полке" + " " + sauce.getPot() + " " + "банок");


        Cheese cheese = new Cheese(20);
        Cheese cheese1 = new Cheese(2);
        cheese.setPrice((float) 243.99);
        cheese.setName("Mozzarella");
        System.out.println("Сыр " + cheese.getName() + " " + "цена " + cheese.getPrice() + "руб.");
        cheese.setPackaging(10);
        System.out.println("на полке" + " " + cheese.getPackaging() + " " + "упаковок");

        System.out.println("------------------------------------------");

        man.makfa();
        man.mozzarella();
        man.bolognese();
        man.putInTheBasket();
        System.out.println("Макароны" + " " + pasta1.getPackaging() + " упаковки," + " " + "Соус" + " " + sauce1.getPot() + " банки,");

        System.out.println("Макароны" + " " + pasta1.getPackaging() + " упаковки," + " " + pasta.getPrice() * pasta1.getPackaging() + "руб.");
        int pasta2 = pasta.getPackaging() - pasta1.getPackaging();
        System.out.println("Остаток на полке" + " " + pasta2 + ", " + "на общую сумму" + " " + pasta.getPrice() * pasta2 + ".");
        shelf.setRow(1);
        shelf.setPackaging(5);

        for (int setRow = 1; setRow <= 1; ++setRow) {
            for (int setPackaging = 1; setPackaging <= pasta2; ++setPackaging) {
                System.out.println("полка[" + setRow + "] осталось упаковока [" + setPackaging + "]");

            }
        }

        System.out.println("Соус" + " " + sauce1.getPot() + " банки," + " " + sauce.getPrice() * sauce1.getPot() + "руб.");
        long sauce2 = sauce.getPot() - sauce1.getPot();
        System.out.println("Остаток на полке" + " " + sauce2 + ", " + "на общую сумму" + " " + sauce.getPrice() * sauce2 + ".");
        man.take();

        boolean poluchitTovar = false;

        if (poluchitTovar) {
            delivery.shipProduct();
            man.delivery();
            man.setAddress2();
        } else
            pickup.storageProduct();

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
        System.out.println("-------------------------------------------");

        woman.makfa();
        woman.mozzarella();
        woman.bolognese();
        woman.putInTheBasket();
        System.out.println("Макароны" + " " + pasta3.getPackaging() + " упаковки," + " " + "Сыр" + " " + cheese1.getPackaging() + " упаковки,");
        System.out.println("Макароны" + " " + pasta3.getPackaging() + " упаковки," + " " + pasta.getPrice() * pasta3.getPackaging() + "руб.");
        int pasta4 = pasta.getPackaging() - (pasta1.getPackaging() + pasta3.getPackaging());
        System.out.println("Остаток на полке" + " " + pasta4 + ", " + "на общую сумму" + " " + pasta.getPrice() * pasta4 + ".");

        shelf.setRow(1);
        shelf.setPackaging(5);
        for (int setRow = 1; setRow <= 1; ++setRow) {
            for (int setPackaging = 1; setPackaging <= pasta4; ++setPackaging) {
                System.out.println("полка [" + setRow + "] осталось упаковока [" + setPackaging + "]");
            }
        }

        System.out.println("Сыр" + " " + cheese1.getPackaging() + " упаковки," + " " + cheese.getPrice() * cheese1.getPackaging() + "руб.");
        int cheese2 = cheese.getPackaging() - cheese1.getPackaging();
        System.out.println("Остаток на полке" + " " + cheese2 + ", " + "на общую сумму" + " " + cheese.getPrice() * cheese2 + ".");
        woman.take();

        poluchitTovar = true;

        if (poluchitTovar) {
            delivery.shipProduct();
            woman.delivery();
            woman.setAddress1();

        } else
            pickup.storageProduct();


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

}






