package ru.Product;

public class Pasta extends Product {
    private String name;
    private float price;



    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Makfa:" + super.toString();
    }

    public static void soldProduct(Pasta pasta) {
        pasta.setPrice((float) 75.00);
        pasta.setName("Makfa");
        System.out.println("Макароны " + pasta.getName() + " " + "цена " + pasta.getPrice() + "руб.");
        pasta.setPackaging(5);
        System.out.println("на полке" + " " + pasta.getPackaging() + " " + "упаковок");
    }

    public static void soldProduct1(Pasta pasta1) {
        pasta1.setPrice((float) 75.00);
        pasta1.setName("Makfa");
        //System.out.println("Макароны " + pasta1.getName() + " " + "цена " + pasta1.getPrice() + "руб.");
        pasta1.setPackaging(2);
       // System.out.println("на полке" + " " + pasta1.getPackaging() + " " + "упаковок");
    }

    public static void soldProduct2(Pasta pasta3) {
        pasta3.setPrice((float) 75.00);
        pasta3.setName("Makfa");
        //System.out.println("Макароны " + pasta3.getName() + " " + "цена " + pasta3.getPrice() + "руб.");
        pasta3.setPackaging(1);
        //System.out.println("на полке" + " " + pasta3.getPackaging() + " " + "упаковок");
    }
}