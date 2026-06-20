package WS1.Observables;

// SensorAlarmListener.java
public class SensorAlarmListener implements AlarmListener {
    private Sensor sensor;

    public SensorAlarmListener(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void wakeup() {
        sensor.check();
    }
}