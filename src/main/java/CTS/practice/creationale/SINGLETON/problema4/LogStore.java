package CTS.practice.creationale.SINGLETON.problema4;

import java.util.ArrayList;
import java.util.List;

public class LogStore extends ObservableStore {
    private List<String> logs;

    public LogStore(String name) {
        super(name);
        logs = new ArrayList<>();
    }

    public void addLog(String log) {
        logs.add(log);
    }

    public List<String> getLogs() {
        return logs;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LogStore{");
        sb.append("logs=").append(logs);
        sb.append('}');
        return sb.toString();
    }
}
