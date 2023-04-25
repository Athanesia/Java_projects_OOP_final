package utils;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CustomLogger {
    private static final Logger logger = Logger.getLogger(CustomLogger.class.getName());

    public CustomLogger() {
        FileHandler fh;

        try {
            fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ошибка создания файла лога", e.getMessage());
        }
    }

    public void log(String message) {
        logger.log(Level.INFO, message);
    }
    public void logError(String message) {
        logger.log(Level.SEVERE, message);
    }
}