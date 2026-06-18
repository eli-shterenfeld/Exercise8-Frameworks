package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemperatureSensor;

public class WeatherMonitoringSystem {
    private static WeatherMonitoringSystem instance = null;

    private Nimbus1PressureSensor pressureSensor;
    private Nimbus1TemperatureSensor temperatureSensor;
    private PressureTrendSensor pressureTrendSensor;

    private WeatherMonitoringSystem() {
        Nimbus1Clock.theInstance();

        pressureSensor = new Nimbus1PressureSensor("pressure", 1100);
        temperatureSensor = new Nimbus1TemperatureSensor("temperature", 700);
        pressureTrendSensor = new PressureTrendSensor("pressure trend");

        pressureSensor.addObserver(pressureTrendSensor);
    }

    public static WeatherMonitoringSystem theInstance() {
        if (instance == null)
            instance = new WeatherMonitoringSystem();

        return instance;
    }

    public void addTemperatureObserver(WS1.Observers.Observer observer) {
        temperatureSensor.addObserver(observer);
    }

    public void addPressureObserver(WS1.Observers.Observer observer) {
        pressureSensor.addObserver(observer);
    }

    public void addPressureTrendObserver(WS1.Observers.Observer observer) {
        pressureTrendSensor.addObserver(observer);
    }
}