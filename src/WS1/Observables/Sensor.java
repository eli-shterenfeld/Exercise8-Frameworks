package WS1.Observables;

public abstract class Sensor extends Observable {
    protected int lastReading;
    protected int interval;
    protected String type;

    public Sensor(String type, int interval) {
        this.type = type;
        this.interval = interval;
        this.lastReading = Integer.MIN_VALUE;
        System.out.println(type + " was created");
    }

    public abstract int read();

    public void check() {
        int currentReading = read();

        if (currentReading != lastReading) {
            lastReading = currentReading;
            notifyObservers(currentReading);
        }
    }

    public int getInterval() {
        return interval;
    }

    public String getType() {
        return type;
    }
}