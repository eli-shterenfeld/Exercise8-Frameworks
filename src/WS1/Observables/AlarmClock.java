package WS1.Observables;// AlarmClock.java
import java.util.ArrayList;

public class AlarmClock {
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList<>();

    protected AlarmClock() {}

    public static AlarmClock theInstance() {
        if(null == instance)
            instance = new AlarmClock();
        return instance;
    }

    protected void tic() {
        for (AlarmClockRecord record : itsAlarmClockRecords) {
            int remaining = record.getRemainingTime() - CLOCK_INTERVAL_MILLIS;
            if (remaining <= 0) {
                record.getListener().wakeup();
                record.setRemainingTime(record.getInterval());
            } else {
                record.setRemainingTime(remaining);
            }
        }
    }

    public void register(int interval, AlarmListener pal) {
        itsAlarmClockRecords.add(new AlarmClockRecord(interval, pal));
    }
}