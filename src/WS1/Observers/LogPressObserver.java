package WS1.Observers;

// LogPressObserver.java
public class LogPressObserver implements Observer {
    private Log log;

    public LogPressObserver(Log log) {
        this.log = log;
        System.out.println("LogPressObserver was created");
    }

    @Override
    public void update(int data) {
        log.displayPress(data);
    }
}