package ru.Shop;


import ru.Shop.Buyer.Man;

public class MBuyer implements Take,ProductSelection {

    private String name;
    private String gender;
    private String address2;
    Man human;

    public MBuyer() {

        name = "name";
        gender = "gender";
        address2 = "address2";
        human = new Man(35, "пол");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Man getHuman() {
        return human;
    }

    public void putInTheBasket() {
        System.out.println("Коля положил товар в корзину");
    }

    boolean Mozzarella = false;
    boolean Makfa = true;
    boolean Bolognese = true;

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
        System.out.println("Коля купил товар");
    }

    public void delivery() {
        System.out.println("получить товар дома");
    }

    public void setAddress2() {
        System.out.println("доставка Коле по адресу г.Самара, ул.Победы 95-55.");
    }

}
