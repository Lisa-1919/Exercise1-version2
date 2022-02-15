package by.training.jwd.les2;

import java.util.Scanner;

public class Logic {
    public int isInputCorrect(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int n;
        while (!scanner.hasNextInt()) {
            System.out.print(message);
            scanner.next();
        }
        n = scanner.nextInt();
        return n;
    }
}
