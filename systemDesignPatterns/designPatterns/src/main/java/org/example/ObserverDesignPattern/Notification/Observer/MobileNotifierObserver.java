package org.example.ObserverDesignPattern.Notification.Observer;

import org.example.ObserverDesignPattern.Notification.Observable.StockObservable;

public class MobileNotifierObserver implements NotifyAlertObserver{
    StockObservable stockObservable;

    public MobileNotifierObserver(StockObservable stockObservable){
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("mobile send "+ stockObservable.getStock());
    }
}
