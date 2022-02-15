package by.training.jwd.les2;

public class Input {
    public int inputByScanner(String message) {
        Logic logic = new Logic();
        int number = logic.isInputCorrect(message);
        return number;
    }
}
