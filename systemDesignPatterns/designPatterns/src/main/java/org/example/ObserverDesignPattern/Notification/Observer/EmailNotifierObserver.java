package org.example.ObserverDesignPattern.Notification.Observer;

import org.example.ObserverDesignPattern.Notification.Observable.StockObservable;

public class EmailNotifierObserver implements NotifyAlertObserver{
    StockObservable stockObservable;

    public EmailNotifierObserver(StockObservable stockObservable){
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("email send "+ stockObservable.getStock());
    }
}
