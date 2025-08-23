package com.gudii16.factoryMethod.product;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}
