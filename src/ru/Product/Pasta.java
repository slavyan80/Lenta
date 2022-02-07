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
        return "Makfa:"+ super.toString();
    }
    public static void soldProduct(Pasta pasta) {
        pasta.setPrice((float) 75.00);
        pasta.setName("Makfa");
        System.out.println("Макароны " + pasta.getName() + " " + "цена " + pasta.getPrice() + "руб.");
        pasta.setPackaging(5);
        System.out.println("на полке" + " " + pasta.getPackaging() + " " + "упаковок");
    }
}
