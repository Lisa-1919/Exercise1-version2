package by.training.jwd.les2;

import java.util.Scanner;

public class Logic {
    public int isInputCorrect(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int n;
        while(!scanner.hasNextInt()){
            System.out.print(message);
            scanner.next();
        }
        n = scanner.nextInt();
        return n;
    }

    public int isValueNonNegative(int a, int b, int c, Output output){
        Input input = new Input();
        int value = b * b + 4 * a * c;
        while(value < 0){
            output.messageOfError("Подкорневое выражение (b^2) + 4*a*c меньше 0");
            a = input.inputNumber("Введите число a: ");
            b = input.inputNumber("Введите число b: ");
            c = input.inputNumber("Введите число c: ");
            value = b * b + 4 * a * c;
        }
        return value;
    }

}
