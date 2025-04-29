package org.example.ObserverDesignPattern.WeatherStation.Observables;

import org.example.ObserverDesignPattern.WeatherStation.Observers.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WSObservable{

    int temp = 0;

    List<DisplayObserver> displayObserverList = new ArrayList<>();

    @Override
    public void add(DisplayObserver displayObserver) {
        displayObserverList.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserver displayObserver) {
        displayObserverList.remove(displayObserver);
    }

    @Override
    public void notification() {
        for(var displayObserver: displayObserverList){
            displayObserver.update();
        }
    }

    @Override
    public void setTemp(int temp) {
        this.temp = temp;
        notification();
    }

    @Override
    public int getTemp() {
        return this.temp;
    }
}
