package ru.Shop;

import ru.Shop.Buyer.Woman;

public class WBuyer<Makfa, mozzarella, makfa> {
    private String name;
    final String gender;
    private String address1;
    Woman human;

    boolean Mozzarella = true;
    boolean Makfa = true;
    boolean Bolognese = false;


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

    public void setAddress1(String address1) {
        this.address1 = address1;

    }

    public String getAddress1() {
        return address1;
    }

    public void putInTheBasket(){
        System.out.println("Юля положила товар в корзину");
    }

    public void take() {
        System.out.println("Юля купила товар");
    }

    public void getOutOfTheBasket(){
        System.out.println("достала товар из корзины");
    }
    public void delivery() {
        System.out.println("получить товар дома");
    }

    String makfa= Makfa == true ? "положить макароны в корзину" : "оставить макароны на полке";

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

    public void setAddress1() {
        System.out.println("доставка Юле по адресу г.Самара, ул.Свободы 5-25.");
    }
}