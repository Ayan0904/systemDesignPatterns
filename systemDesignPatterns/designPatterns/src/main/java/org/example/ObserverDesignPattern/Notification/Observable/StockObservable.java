package org.example.ObserverDesignPattern.Notification.Observable;

import org.example.ObserverDesignPattern.Notification.Observer.NotifyAlertObserver;

public interface StockObservable {
    public void add(NotifyAlertObserver notifyAlertObserver);

    public void remove(NotifyAlertObserver notifyAlertObserver);

    public void notification();

    public void addStock(int qty);

    public int getStock();

}
