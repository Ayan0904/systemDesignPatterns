package org.example.ObserverDesignPattern.Notification;

import org.example.ObserverDesignPattern.Notification.Observable.IPhoneObservable;
import org.example.ObserverDesignPattern.Notification.Observable.StockObservable;
import org.example.ObserverDesignPattern.Notification.Observer.EmailNotifierObserver;
import org.example.ObserverDesignPattern.Notification.Observer.MobileNotifierObserver;
import org.example.ObserverDesignPattern.Notification.Observer.NotifyAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable stockObservable = new IPhoneObservable();
        NotifyAlertObserver notifyAlertObserver1 = new EmailNotifierObserver(stockObservable);
        NotifyAlertObserver notifyAlertObserver2 = new MobileNotifierObserver(stockObservable);

        stockObservable.add(notifyAlertObserver1);
        stockObservable.add(notifyAlertObserver2);

        stockObservable.addStock(10);
        stockObservable.addStock(20);
    }
}
