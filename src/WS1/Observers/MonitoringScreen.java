package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;
import WS1.Observables.Trend;

public class Log {
    public Log(WeatherMonitoringSystem ws) {
        System.out.println("Log was created");

        ws.addPressureObserver(new LogPressObserver(this));
        ws.addPressureTrendObserver(new LogPressTrendObserver(this));
    }

    public void displayPressure(int pressure) {
        System.out.println("Log: pressure = " + pressure + " millibars");
    }

    public void displayPressureTrend(Trend trend) {
        System.out.println("Log: pressure trend = " + trend);
    }
}