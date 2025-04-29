package org.example.ObserverDesignPattern.WeatherStation.Observables;

import org.example.ObserverDesignPattern.WeatherStation.Observers.DisplayObserver;

public interface WSObservable {
    public void add(DisplayObserver displayObserver);
    public void remove(DisplayObserver displayObserver);

    public void notification();

    public void setTemp(int temp);

    public int getTemp();
}
