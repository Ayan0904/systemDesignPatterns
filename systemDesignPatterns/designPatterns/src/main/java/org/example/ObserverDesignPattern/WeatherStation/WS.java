package org.example.ObserverDesignPattern.WeatherStation;

import org.example.ObserverDesignPattern.WeatherStation.Observables.WSObservable;
import org.example.ObserverDesignPattern.WeatherStation.Observables.WeatherStation;
import org.example.ObserverDesignPattern.WeatherStation.Observers.TVDisplayObserver;

public class WS {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TVDisplayObserver tvDisplayObserver = new TVDisplayObserver(weatherStation);
        weatherStation.add(tvDisplayObserver);
        weatherStation.setTemp(10);
        weatherStation.setTemp(20);
    }
}
