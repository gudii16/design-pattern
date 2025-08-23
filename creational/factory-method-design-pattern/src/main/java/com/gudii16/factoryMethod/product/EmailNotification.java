package com.gudii16.factoryMethod.product;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending email Notification");
    }
}
