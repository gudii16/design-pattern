package com.gudii16.factoryMethod.factory;

import com.gudii16.factoryMethod.product.EmailNotification;
import com.gudii16.factoryMethod.product.Notification;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
