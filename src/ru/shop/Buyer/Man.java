package ru.shop.Buyer;

import ru.shop.MBuyer;

public class Man {
    private int age;
    String gender;

    public Man(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public static void Buyer(MBuyer man) {
        man.setName("Покупатель: Коля, возрост:" + man.getHuman().getAge() + "лет," + " " + man.getHuman().getGender() + " " + "мужской.");
        System.out.println(man.getName());
    }

}