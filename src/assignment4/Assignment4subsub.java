package assignment4;

public class Assignment4subsub {
    public static void main(String args[]){
    System.out.println(Static.x);
}}
class Static{
static int x;
static void data(int b){
    x=b;
}
static {
    data( 5);
    }
}
