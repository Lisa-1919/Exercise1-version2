package by.training.jwd.les2;

import java.util.Scanner;

public class Logic {

    public int inputEvenNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.print(message);
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n % 2 != 0 || n <= 0);
        return n;
    }
}
