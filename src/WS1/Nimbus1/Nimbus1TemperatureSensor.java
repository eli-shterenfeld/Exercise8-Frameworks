package WS1.Nimbus1;// Nimbus1TemperatureSensor.java
import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor {
    private Random rnd;

    public Nimbus1TemperatureSensor(String type, int interval) {
        super(type, interval);
        rnd = RandomSupplier.getRnd();
    }

    @Override
    protected int read() {
        return rnd.nextInt(40);
    }
}