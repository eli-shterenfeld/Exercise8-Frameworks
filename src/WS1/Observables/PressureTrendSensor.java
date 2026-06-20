package WS1.Observables;

import WS1.Observers.Observer;

// PressureTrendSensor.java
public class PressureTrendSensor extends Observable implements Observer {
    private int lastReading1 = 0;
    private int lastReading2 = 0;
    private int lastReading3 = 0;
    private Trend pressureState = Trend.STABLE;
    private Trend lastState = Trend.STABLE;

    public PressureTrendSensor() {
        //System.out.println("PressureTrendSensor was created");
    }

    @Override
    public void update(int data) {
        lastReading1 = lastReading2;
        lastReading2 = lastReading3;
        lastReading3 = data;
        calc();
        check();
    }

    public void calc() {
        if (lastReading1 < lastReading2 && lastReading2 < lastReading3) {
            pressureState = Trend.RISING;
        } else if (lastReading1 > lastReading2 && lastReading2 > lastReading3) {
            pressureState = Trend.FALLING;
        } else {
            pressureState = Trend.STABLE;
        }
    }

    public void check() {
        if (pressureState != lastState) {
            lastState = pressureState;
            notifyObservers(pressureState.ordinal());
        }
    }
}