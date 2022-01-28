package ru.Shop;


import ru.Shop.Buyer.Woman;

public class WBuyer implements Take,ProductSelection {

    private String name;
    private String gender;
    private String address1;
    Woman human;

    public WBuyer() {

        name = "name";
        gender = "gender";
        address1 = "address1";
        human = new Woman(27, "пол");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Woman getHuman() {
        return human;
    }

    public void putInTheBasket() {
        System.out.println("Юля выбрала и положила товар в корзину");
    }

    boolean Mozzarella = true;
    boolean Makfa = true;
    boolean Bolognese = false;

    String makfa = Makfa == true ? "положить макароны в корзину" : "оставить макароны на полке";
    String mozzarella = Mozzarella == true ? "положить сыр в корзину" : "оставить сыр на полке";
    String bolognese = Bolognese == true ? "положить соус в корзину" : "оставить соус на полке";

    public void makfa() {
        System.out.println(makfa);
    }

    public void mozzarella() {
        System.out.println(mozzarella);
    }

    public void bolognese() {
        System.out.println(bolognese);
    }

    public void take() {
        System.out.println("Юля купила товар");
    }

    public void delivery() {
        System.out.println("получить товар дома");
    }

    public void setAddress1() {
        System.out.println("доставка Юле по адресу г.Самара, ул.Свободы 5-25.");
    }
}