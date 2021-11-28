package Lesson9;

public enum LoggerType {
    ERROR("Error was detected!"),
    WARNING("Warning was detected!"),
    INFO("Information message..."),
    DE_BUG("De bug mode on");

    private String type;

    LoggerType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}



