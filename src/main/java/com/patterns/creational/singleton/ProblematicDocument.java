package com.patterns.creational.singleton;

public class ProblematicDocument {

    public void logInfo() {
        Logger log = Logger.getInstance();

        try {
            log.log("Everything went well so far.");
            throw new RuntimeException("Ops, we got a problem.");
        } catch (RuntimeException e) {
            log.error(e.getMessage());
        }
    }
}
