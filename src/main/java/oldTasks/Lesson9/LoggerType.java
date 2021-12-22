package oldTasks.Lesson9;

public enum LoggerType {
    ERROR("Log[ERROR]"),
    WARNING("Log[WARNING]"),
    INFO("Log[INFO]"),
    DEBUG("Log[DEBUG]");

    private String type;

    LoggerType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}



