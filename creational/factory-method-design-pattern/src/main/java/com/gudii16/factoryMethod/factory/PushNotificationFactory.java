package com.gudii16.factoryMethod.factory;

import com.gudii16.factoryMethod.product.Notification;
import com.gudii16.factoryMethod.product.PushNotification;

public class PushNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
