package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemperatureSensor;
import WS1.Observers.Observer;

// WeatherMonitoringSystem.java
public class WeatherMonitoringSystem {
    private static WeatherMonitoringSystem instance = null;
    private Nimbus1TemperatureSensor tempSensor;
    private Nimbus1PressureSensor pressSensor;
    private PressureTrendSensor pressTrendSensor;

    protected WeatherMonitoringSystem() {
        System.out.println("WeatherMonitoringSystem was created");

        Nimbus1Clock.theInstance();

        pressSensor = new Nimbus1PressureSensor("pressure", 1100);
        tempSensor = new Nimbus1TemperatureSensor("temperature", 700);

        pressTrendSensor = new PressureTrendSensor();
        pressSensor.addObserver(pressTrendSensor);
        System.out.println("PressureTrendSensor observes pressure");
    }

    public static WeatherMonitoringSystem theInstance() {
        if (instance == null) {
            instance = new WeatherMonitoringSystem();
        }
        return instance;
    }

    public void addTempObserver(Observer o) {
        tempSensor.addObserver(o);
    }

    public void addPressObserver(Observer o) {
        pressSensor.addObserver(o);
    }

    public void addPressTrendObserver(Observer o) {
        pressTrendSensor.addObserver(o);
    }
}