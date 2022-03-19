package ru.shop;


import ru.shop.Buyer.Man;

public class MBuyer implements Take, ProductSelection {

    private String name;
    private String gender;
    private String address2;
    private String cardNumber;
    Man human;

    public MBuyer() {

        name = "name";
        gender = "gender";
        address2 = "address2";
        human = new Man(35, "пол");

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
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
        System.out.println("Коля выбрал и положил товар в корзину");
    }

    boolean Mozzarella = false;
    boolean Makfa = true;
    boolean Bolognese = true;

    String makfa = Makfa  ?"положить макароны в корзину" : "оставить макароны на полке";
    String mozzarella = Mozzarella  ?"положить сыр в корзину" : "оставить сыр на полке";
    String bolognese = Bolognese  ? "положить соус в корзину" : "оставить соус на полке";

    public void makfa() {
        System.out.println(makfa);
    }

    public void mozzarella() {
        System.out.println(mozzarella);
    }

    public void bolognese() {
        System.out.println(bolognese);
    }

    public void take() {// ("Коля купил товар");
    }

    public void delivery() {// ("получить товар дома");
    }

    public void setAddress2() {
        System.out.println("доставка Коле по адресу г.Самара, ул.Победы 95-55.");
    }

}
