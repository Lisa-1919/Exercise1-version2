package by.training.jwd.les2;

public class Output {
    public void print(int a, int b, int c, double result){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("result = " + result);
    }

    public void messageOfError(String message){
        System.out.println(message);
    }
}
