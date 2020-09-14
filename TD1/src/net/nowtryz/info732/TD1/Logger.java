package net.nowtryz.info732.TD1;

public class Logger {
    private static Logger logger;

    private Logger() {}

    public static Logger getLogger() {
        if (logger == null) synchronized (Logger.class) {
            if (logger == null) logger = new Logger();
        }
        return logger;
    }

    public void info(String message) {
        System.out.println("[INFO] " + message);
    }

    public void warn(String message) {
        System.out.println("[WARN] " + message);
    }
}
