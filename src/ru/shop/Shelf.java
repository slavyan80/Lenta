package ru.shop;

import ru.Product.Cheese;
import ru.Product.Pasta;
import ru.Product.Sauce;

public class Shelf{
    private int row;
    private int packaging;

    public Shelf(int packaging){
    }

    public Shelf() {

    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setPackaging(int packaging) {
        this.packaging = packaging;
    }
    public static void productOnTheShelf(Shelf shelf, Pasta pasta, Pasta pasta1, Pasta pasta3, Cheese cheese, Cheese cheese1) {
        int pasta4 = pasta.getPackaging() - (pasta1.getPackaging() + pasta3.getPackaging());
        //System.out.println("Остаток на полке" + " " + pasta4 + ", " + "на общую сумму" + " " + pasta.getPrice() * pasta4 + ".");

       /* shelf.setRow(1);
        shelf.setPackaging(5);
        for (int setRow = 1; setRow <= 1; ++setRow) {
            for (int setPackaging = 1; setPackaging <= pasta4; ++setPackaging) {
                System.out.println("полка [" + setRow + "] осталось упаковока [" + setPackaging + "]");
            }
        }*/

        System.out.println("Сыр" + " " + cheese1.getPackaging() + " упаковки" + " " + cheese.getPrice() * cheese1.getPackaging() + "руб.");
        //int cheese2 = cheese.getPackaging() - cheese1.getPackaging();
       // System.out.println("Остаток на полке" + " " + cheese2 + ", " + "на общую сумму" + " " + cheese.getPrice() * cheese2 + ".");
    }

    public static void productOnTheShelf(Shelf shelf, Pasta pasta, Pasta pasta1, Sauce sauce, Sauce sauce1) {
        int pasta2 = pasta.getPackaging() - pasta1.getPackaging();
       // System.out.println("Остаток на полке" + " " + pasta2 + ", " + "на общую сумму" + " " + pasta.getPrice() * pasta2 + ".");

       /* shelf.setRow(1);
        shelf.setPackaging(5);

        for (int setRow = 1; setRow <= 1; ++setRow) {
            for (int setPackaging = 1; setPackaging <= pasta2; ++setPackaging) {
                System.out.println("полка[" + setRow + "] осталось упаковока [" + setPackaging + "]");

            }
        }*/

        System.out.println("Соус" + " " + sauce1.getPot() + " банки" + " " + sauce.getPrice() * sauce1.getPot() + "руб.");
       // long sauce2 = sauce.getPot() - sauce1.getPot();
        //System.out.println("Остаток на полке" + " " + sauce2 + ", " + "на общую сумму" + " " + sauce.getPrice() * sauce2 + ".");
    }



}






