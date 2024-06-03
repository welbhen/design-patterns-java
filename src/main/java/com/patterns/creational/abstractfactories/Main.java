package com.patterns.creational.abstractfactories;

/**
 * Main class.
 */
public class Main {

    public static void main(String[] args) {
        // Create UserInterfaces:
        UserInterface redUI = createUI("red");
        UserInterface blueUI = createUI("blue");

        // Let's check our UIs:
        System.out.println("---- RED UI ----");
        System.out.println(redUI.toString());
        System.out.println("---- BLUE UI ----");
        System.out.println(blueUI.toString());
    }

    private static UserInterface createUI(String color) {
        UserInterfaceFactory uiFactory = FactoryMaker.createFactory(color.toUpperCase());
        Button btn = uiFactory.createButton();
        Scrollbar scrollbar = uiFactory.createScrollbar();

        return new UserInterface(btn, scrollbar);
    }
 }
