package ru.Product;

import ru.Shop.MBuyer;
import ru.Shop.WBuyer;

public class  Product {
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
    public static void productSelectionWBuyer(WBuyer woman, Pasta pasta, Pasta pasta3, Cheese cheese1) {
        woman.makfa();
        woman.mozzarella();
        woman.bolognese();
        woman.putInTheBasket();
        System.out.println("Макароны" + " " + pasta3.getPackaging() + " упаковки," + " " + "Сыр" + " " + cheese1.getPackaging() + " упаковки,");
        System.out.println("Макароны" + " " + pasta3.getPackaging() + " упаковки," + " " + pasta.getPrice() * pasta3.getPackaging() + "руб.");
    }
    public static void productSelectionMBuyer(MBuyer man, Pasta pasta, Pasta pasta1, Sauce sauce1) {
        man.makfa();
        man.mozzarella();
        man.bolognese();
        man.putInTheBasket();
        System.out.println("Макароны" + " " + pasta1.getPackaging() + " упаковки," + " " + "Соус" + " " + sauce1.getPot() + " банки,");
        System.out.println("Макароны" + " " + pasta1.getPackaging() + " упаковки," + " " + pasta.getPrice() * pasta1.getPackaging() + "руб.");
    }

}



