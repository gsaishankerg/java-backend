package assignment9;

public class Exception
{
    public void test(int a,int b) {
        try {
            if(b==0) {
                throw new Excep("Cannot Divide By zero");
            }
            else {
                System.out.println(a/b);
            }
        }
        catch(Excep r) {

            System.out.println(r);

        }

    }
    public static void main(String [] args) {
        Exception r=new Exception();
        r.test(5,0);
    }
}