package oldTasks.Lesson10;

public class EmptyDeckException extends Exception {
    public EmptyDeckException() {
        super("There are no more cards in the deck");
    }

    public void printStackTrace() {
        super.printStackTrace();
    }

}
