package assignment4;

public class Assignment4subsubsub {
    public static void main(String args[])
    {
        abc obj=new abc();
        int y=obj.x;
        obj.m();
        System.out.println(y);
    }
}
final class abc
{
    final int x=10;
    final void m()
    {
        System.out.println("final method");
    }
}
