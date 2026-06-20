package WS1.Observers;

// MSTempObserver.java
public class MSTempObserver implements Observer {
    private MonitoringScreen ms;

    public MSTempObserver(MonitoringScreen ms) {
        this.ms = ms;
        System.out.println("MSTempObserver was created");
    }

    @Override
    public void update(int data) {
        ms.displayTemp(data);
    }
}