package assignment4;

public class Assignment4 implements animal,bird {
    @Override
    public void sound() {
        System.out.println("bow");
    }

    @Override
    public void color() {
        System.out.println("black");
    }
    public static void main(String[] args) {
        Assignment4 A=new Assignment4();
        A.sound();
        A.color();
    }
}
interface animal{
    public void sound();
}
interface bird{
    public void color();
}

