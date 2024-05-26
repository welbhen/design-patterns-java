package com.patterns.creational.singleton;

/**
 * This is our Singleton Class.
 *      final - means it can not be extended.
 *      static methods - belong to the Class. You can call them without creating an instance.
 */
public final class Logger {
    /**
     * A private constructor makes it impossible to be instantiated from other classes
     * it can only be created from inside this Class.
     */
    private Logger() {}

    private static Logger INSTANCE;

    /**
     * synchronized - make this method accessible by only one thread at a time: thread safety.
     *
     * @return Logger instance
     */
    public static synchronized Logger getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    // non-static methods (need an instance to be called):

    public void log(String message) {
        System.out.println(message);
    }

    public void error(String message) {
        System.out.println("ERROR: " + message);
    }
}
