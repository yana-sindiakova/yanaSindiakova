package oldTasks.Lesson9;

public class Logger {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";

    public static void setLogger(LoggerType type, String message) {
        if (type == LoggerType.ERROR) {
            System.out.println(ANSI_RED + type.getType() + message + ANSI_RESET);
        } else if (type == LoggerType.WARNING) {
            System.out.println(ANSI_YELLOW + type.getType() + message + ANSI_RESET);
        } else if (type == LoggerType.INFO) {
            System.out.println(ANSI_GREEN + type.getType() + message + ANSI_RESET);
        } else if (type == LoggerType.DEBUG) {
            System.out.println(ANSI_BLUE + type.getType() + message + ANSI_RESET);
        }
    }
}

