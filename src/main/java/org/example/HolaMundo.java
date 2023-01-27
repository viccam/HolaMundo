package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HolaMundo {

    public static void main(String[] args) {

        // logger with loging class
        Logger logger = Logger.getLogger(HolaMundo.class.getName());
        logger.log(Level.INFO, "this is message 1");
        logger.log(Level.WARNING, "this is message 2");

        // log messages using
        // log(Level level, String msg, Object param1)
        logger.log(Level.INFO, "logging: {0} ", "message1");
    }
}