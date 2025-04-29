package org.example.ObserverDesignPattern.Notification.Observable;

import org.example.ObserverDesignPattern.Notification.Observer.NotifyAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements StockObservable{

    List<NotifyAlertObserver> notifyAlertObserverList = new ArrayList<>();
    int stock = 0;
    @Override
    public void add(NotifyAlertObserver notifyAlertObserver) {
        notifyAlertObserverList.add(notifyAlertObserver);
    }

    @Override
    public void remove(NotifyAlertObserver notifyAlertObserver) {
        notifyAlertObserverList.remove(notifyAlertObserver);
    }

    @Override
    public void notification() {
        for(var notify: notifyAlertObserverList){
            notify.update();
        }
    }

    @Override
    public void addStock(int qty) {
        if(stock==0){
            stock+=qty;
            notification();
        }
        else {
            stock += qty;
        }
    }

    @Override
    public int getStock() {
        return stock;
    }
}
