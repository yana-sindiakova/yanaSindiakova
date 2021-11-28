package Lesson9;

public class Logger {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void setLogger(LoggerType type) {
        if (type == LoggerType.ERROR) {
            System.out.println(ANSI_RED + type.getType() + ANSI_RESET);
        } else if (type == LoggerType.WARNING) {
            System.out.println(ANSI_YELLOW + type.getType() + ANSI_RESET);
        } else if (type == LoggerType.INFO) {
            System.out.println(ANSI_GREEN + type.getType() + ANSI_RESET);
        } else if (type == LoggerType.DE_BUG) {
            System.out.println(ANSI_BLUE + type.getType() + ANSI_RESET);
        }
    }
}

