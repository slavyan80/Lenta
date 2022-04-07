package ru.shop;


public class ShopThread extends Thread {

    public ShopThread(String threadName){
        super(threadName);
    }
    public void run() {
        System.out.printf(java.lang.Thread.currentThread().getName() + " "+ "started...\n ");
        try{
            java.lang.Thread.sleep(3500);
        }catch (InterruptedException ex){
            System.out.println("Tread has been interrupted");
        }


    }

}