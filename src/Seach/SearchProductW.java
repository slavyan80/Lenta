package Seach;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SearchProductW {
    String name;
    static String s;


    public static void searchW() {

        try {
            FileInputStream fin = new FileInputStream ("file/DB.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fin));
            Scanner sc = new Scanner(System.in);
            System.out.println("укажите имя продукта");
            String name = sc.next();

            while (true) {
                    s = br.readLine();
                try {
                    if (s.equalsIgnoreCase(name)) {
                        System.out.println("продукт : " + name);
                        System.out.println("название : " + br.readLine());
                        System.out.println("цена : " + br.readLine());

                        break;
                    }
                } catch (NullPointerException e) {
                    System.out.println("такого продукта нет");
                    break;
                }
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

