package org.woven.core;

import java.time.LocalDateTime;

public final class LogEntry {
    private final LogLevel level;
    private final LocalDateTime timeStamp;
    private final String message;

    public LogEntry(LogLevel logLevel, String message) {
        this.level = logLevel;
        this.message = message;
        this.timeStamp = LocalDateTime.now();
    }

    public LogLevel getLevel() {
        return level;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "level=" + level +
                ", timeStamp=" + timeStamp +
                ", message='" + message + '\'' +
                '}';
    }
}
