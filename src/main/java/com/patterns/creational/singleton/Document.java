package com.patterns.creational.singleton;

public class Document {

    public void logInfo() {
        Logger log = Logger.getInstance();
        log.log("Hello from my Document class");
    }
}
