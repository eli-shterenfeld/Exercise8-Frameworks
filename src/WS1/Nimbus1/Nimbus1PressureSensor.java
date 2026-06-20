package WS1.Nimbus1;// Nimbus1PressureSensor.java
import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor {
    private Random rnd;

    public Nimbus1PressureSensor(String type, int interval) {
        super(type, interval);
        rnd = RandomSupplier.getRnd();
    }

    @Override
    protected int read() {
        return 950 + rnd.nextInt(100);
    }
}