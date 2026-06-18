package WS1.Nimbus1;

import WS1.Observables.Sensor;

public class Nimbus1PressureSensor extends Sensor {
    public Nimbus1PressureSensor(String type, int interval) {
        super(type, interval);
        System.out.println("Nimbus1PressureSensor was created");
    }

    @Override
    public int read() {
        return 950 + RandomSupplier.getRnd().nextInt(100);
    }
}