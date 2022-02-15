package by.training.jwd.les2;

public class Main {

    public static void main(String[] args) {
        Function function = new Function();
        Input input = new Input();
        Output output = new Output();

        int a = input.inputByScanner("Введите число а: ");
        int b = input.inputByScanner("Введите число b: ");
        int c = input.inputByScanner("Введите число c: ");

        output.print(a, function.exponentialNumber(a));
        output.print(b, function.exponentialNumber(b));
        output.print(c, function.exponentialNumber(c));
    }
}
