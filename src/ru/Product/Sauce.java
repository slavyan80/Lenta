package ru.Product;

public class Sauce extends Product {
    private String name;
    private float price;

    public Sauce(int pot) {
        super(pot);
    }

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
        return "Bolognese:"+ super.toString();
    }
    public static void soldProduct(Sauce sauce) {
        sauce.setPrice((float) 96.60);
        sauce.setName("Bolognese");
        System.out.println("Соус " + sauce.getName() + " " + "цена " + sauce.getPrice() + "руб.");
        sauce.setPot(10);
        System.out.println("на полке" + " " + sauce.getPot() + " " + "банок");
    }
    public static void soldProduct1(Sauce sauce1) {
        sauce1.setPrice((float) 96.60);
        sauce1.setName("Bolognese");
       // System.out.println("Соус " + sauce1.getName() + " " + "цена " + sauce1.getPrice() + "руб.");
        sauce1.setPot(1);
       // System.out.println("на полке" + " " + sauce1.getPot() + " " + "банок");
    }
}
