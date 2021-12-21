package oldTasks.Lesson9;

public class Main {
    public static void main(String[] args) {

        Logger.setLogger(LoggerType.ERROR, " No pointer exception");
        Logger.setLogger(LoggerType.DEBUG, " Value=56");
        Logger.setLogger(LoggerType.WARNING, " Library version is deprecated");
        Logger.setLogger(LoggerType.INFO, " Try to call the method");
    }
}
