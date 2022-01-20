package ru.Product;

public class Cheese extends Product {
    private String name;
    private float price;

    public Cheese(int packaging) {
        super(packaging);
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
    public static void soldProduct(Cheese cheese) {
        cheese.setPrice((float) 243.99);
        cheese.setName("Mozzarella");
        System.out.println("Сыр " + cheese.getName() + " " + "цена " + cheese.getPrice() + "руб.");
        cheese.setPackaging(10);
        System.out.println("на полке" + " " + cheese.getPackaging() + " " + "упаковок");
    }


}
