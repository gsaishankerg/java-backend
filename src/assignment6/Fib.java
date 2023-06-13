package assignment6;

public class Fib {
    public static void main(String[] args) {
        printFib(10);
    }
    public static void printFib(int upperBound) {
        int a = 0, b = 1, step = 2, c;
        System.out.print(a+" "+b+" ");
        while(step < upperBound) {
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            step++;
        }
    }
}