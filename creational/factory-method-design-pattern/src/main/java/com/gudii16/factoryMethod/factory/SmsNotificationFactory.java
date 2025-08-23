package com.gudii16.factoryMethod.factory;

import com.gudii16.factoryMethod.product.Notification;
import com.gudii16.factoryMethod.product.SmsNotification;

public class SmsNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
