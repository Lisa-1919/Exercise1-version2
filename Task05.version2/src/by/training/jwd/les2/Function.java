package by.training.jwd.les2;

public class Function {
    public int exponentialNumber(int number) {
        int result;
        if (number < 0) {
            result = (int) Math.pow(number, 4);
        } else {
            result = (int) Math.pow(number, 2);
        }
        return result;
    }
}
