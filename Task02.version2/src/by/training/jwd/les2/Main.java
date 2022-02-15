package by.training.jwd.les2;

public class Main {

    public static void main(String[] args) {
        Function function = new Function();
        Input input = new Input();
        Output output = new Output();

        int a = input.inputNumber("Введите число a: ");
        int b = input.inputNumber("Введите число b: ");
        int c = input.inputNumber("Введите число c: ");

        double result = function.calculate(a, b, c);

        output.print(a, b, c, result);
    }
}
