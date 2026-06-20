package WS1.Observers;

import WS1.Observables.Trend;
import WS1.Observables.WeatherMonitoringSystem;

// Log.java
public class Log {
    public Log(WeatherMonitoringSystem ws) {
        System.out.println("Log was created");
        ws.addPressObserver(new LogPressObserver(this));
        System.out.println("LogPressObserver observes pressure");
        ws.addPressTrendObserver(new LogPressTrendObserver(this));
        System.out.println("LogPressTrendObserver observes pressure trend");
    }

    public void displayPress(int data) {
        System.out.println("Log: pressure = " + data + " millibars");
    }

    public void displayPressTrend(int data) {
        Trend[] trends = Trend.values();
        System.out.println("Log: pressure trend = " + trends[data].name());
    }
}