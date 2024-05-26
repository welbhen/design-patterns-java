package com.patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        // Let's create our Documents instances...
        Document document = new Document();
        ProblematicDocument problematicDocument = new ProblematicDocument();

        // Let's see what happens when we try to operate them:
        System.out.println("---- Document ----");
        document.logInfo();

        System.out.println("---- ProblematicDocument ----");
        problematicDocument.logInfo();
    }
}
