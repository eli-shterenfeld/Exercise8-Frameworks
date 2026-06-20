package WS1.Observers;

// LogPressTrendObserver.java
public class LogPressTrendObserver implements Observer {
    private Log log;

    public LogPressTrendObserver(Log log) {
        this.log = log;
        System.out.println("LogPressTrendObserver was created");
    }

    @Override
    public void update(int data) {
        log.displayPressTrend(data);
    }
}