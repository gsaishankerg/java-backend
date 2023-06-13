package assignment9;

public class Except
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
        Except r=new Except();
        r.test(5,0);
    }
}