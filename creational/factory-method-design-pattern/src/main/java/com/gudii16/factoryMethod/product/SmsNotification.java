package com.gudii16.factoryMethod.product;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}
