package WS1.Observables;

// AlarmClockRecord.java
public class AlarmClockRecord {
    private int interval;
    private int remainingTime;
    private AlarmListener listener;

    public AlarmClockRecord(int interval, AlarmListener listener) {
        this.interval = interval;
        this.remainingTime = interval;
        this.listener = listener;
    }

    public int getInterval() { return interval; }
    public int getRemainingTime() { return remainingTime; }
    public void setRemainingTime(int remainingTime) { this.remainingTime = remainingTime; }
    public AlarmListener getListener() { return listener; }
}