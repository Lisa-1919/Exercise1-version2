package by.training.jwd.les2;

public class Function {
    public double calculate(int a, int b, int c) {
        Input input = new Input();
        Logic logic = new Logic();

        if (a == 0) {
            a = input.inputNumber("Число а не может равняться 0. Введите число повторно: ");
        }
        int i = logic.isValueNonNegative(a, b, c, new Output());//проверка подкорневого выражения (b * b + 4 * a * c)
        return (b + Math.sqrt(i)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
