package by.training.jwd.les2;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        Array array = new Array();

        int n = input.inputByScanner("Введите четное число больше 0: ");
        int[][] arr = new int[n][n];
        array.fill(arr);
        output.print(arr);
    }
}
