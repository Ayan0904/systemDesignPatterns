package org.example.ObserverDesignPattern.WeatherStation.Observers;

import org.example.ObserverDesignPattern.WeatherStation.Observables.WSObservable;

public class TVDisplayObserver implements DisplayObserver{
    WSObservable wsObservable;

    public TVDisplayObserver(WSObservable wsObservable){
        this.wsObservable = wsObservable;
    }

    @Override
    public void update() {
        System.out.println("temperature is " + wsObservable.getTemp());
    }
}
