package ru.shop.Buyer;

import ru.shop.WBuyer;

public class Woman {
    private int age;
    String gender;

    public Woman(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public static void Buyer(WBuyer woman) {
        woman.setName("Покупатель: Юля, возрост:" + woman.getHuman().getAge() + "лет," + " " + woman.getHuman().getGender() + " " + "женский.");
        System.out.println(woman.getName());
    }


}