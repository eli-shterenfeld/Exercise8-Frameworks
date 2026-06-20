package WS1.Observers;

// MSPressObserver.java
public class MSPressObserver implements Observer {
    private MonitoringScreen ms;

    public MSPressObserver(MonitoringScreen ms) {
        this.ms = ms;
        System.out.println("MSPressObserver was created");
    }

    @Override
    public void update(int data) {
        ms.displayPress(data);
    }
}