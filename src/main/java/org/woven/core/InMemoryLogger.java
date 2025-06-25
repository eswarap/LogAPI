package org.woven.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InMemoryLogger {
    private static final InMemoryLogger instance = new InMemoryLogger();
    private final List<LogEntry> logs = Collections.synchronizedList(new ArrayList<>());

    private InMemoryLogger() {}

    public static InMemoryLogger getInstance() {
        return instance;
    }

    public List<LogEntry> getLogs() {
        synchronized (logs) {
            return logs;
        }
    }

    public List<LogEntry> getLogs(LogLevel logLevel) {
        synchronized (logs){
            return logs.stream().filter(log-> log.getLevel() == logLevel).toList();
        }
    }

    public void setLogs(LogLevel logLevel, String message) {
        logs.add(new LogEntry(logLevel,message));

    }

}
