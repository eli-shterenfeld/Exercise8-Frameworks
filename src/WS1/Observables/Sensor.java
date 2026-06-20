package WS1.Observables;

// Sensor.java
public abstract class Sensor extends Observable {
    protected int lastReading = 0;
    protected int interval;
    protected String type;

    public Sensor(String type, int interval) {
        this.type = type;
        this.interval = interval;
        //System.out.println(type + " was created");
        AlarmClock.theInstance().register(interval, new SensorAlarmListener(this));
        System.out.println(type + " registered to clock");
    }

    protected abstract int read();

    public void check() {
        int val = read();
        if (val != lastReading) {
            lastReading = val;
            notifyObservers(val);
        }
    }
}