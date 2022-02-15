package by.training.jwd.les2;

import java.util.Scanner;

public class Input {
    public int inputByScanner(String message){
        Logic logic = new Logic();
        int n = logic.inputEvenNumber(message);
        return n;
    }
}
