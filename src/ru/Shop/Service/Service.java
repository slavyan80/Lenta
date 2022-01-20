package ru.Shop.Service;

import ru.Shop.MBuyer;
import ru.Shop.WBuyer;

public class Service {
    private String deliveryMBuyer;
    private String deliveryWBuyer;

    public Service(){

    }
    public String getDeliveryWBuyer() {
        return deliveryWBuyer;
    }

    public void setDeliveryWBuyer(String deliveryWBuyer) {
        this.deliveryWBuyer = deliveryWBuyer;
    }

    public String getDeliveryMBuyer() {
        return deliveryMBuyer;
    }

    public void setDeliveryMBuyer(String deliveryMBuyer) {
        this.deliveryMBuyer = deliveryMBuyer;
    }

    public static void deliveryWBuyer(WBuyer woman, Delivery delivery, Pickup pickup) {
        boolean poluchitTovar;
        poluchitTovar = true;

        if (poluchitTovar) {
            delivery.shipProduct();
            woman.delivery();
            woman.setAddress1();

        } else
            pickup.storageProduct();
    }
    public static void deliveryMBuyer(MBuyer man, Delivery delivery, Pickup pickup) {
        boolean poluchitTovar = false;

        if (poluchitTovar) {
            delivery.shipProduct();
            man.delivery();
            man.setAddress2();
        } else
            pickup.storageProduct();
    }
}
