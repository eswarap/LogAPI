package org.woven.core;

public class InMemoryLoggerTest {

    public static void main(String[] args) {
        InMemoryLogger logger = InMemoryLogger.getInstance();
        logger.setLogs(LogLevel.INFO,"Test started");
        logger.setLogs(LogLevel.INFO,"Test running");
        logger.setLogs(LogLevel.DEBUG,"logging message at DEBUG level");
        logger.setLogs(LogLevel.WARN,"logging message at WARN level");
        logger.setLogs(LogLevel.ERROR,"logging message at ERROR level");
        logger.setLogs(LogLevel.INFO,"Test Exit");

        System.out.println("All logs");
        logger.getLogs().forEach(System.out::println);
        System.out.println("INFO logs");
        logger.getLogs(LogLevel.INFO).forEach(System.out::println);
    }
}
