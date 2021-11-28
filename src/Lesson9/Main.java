package Lesson9;

public class Main {
    public static void main(String[] args) {
        Logger.setLogger(LoggerType.ERROR);
        Logger.setLogger(LoggerType.DE_BUG);
        Logger.setLogger(LoggerType.WARNING);
        Logger.setLogger(LoggerType.INFO);
    }
}
