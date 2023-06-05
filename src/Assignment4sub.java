public class Assignment4sub {
    public static void main(String args[]){
        child obj = new child("sai");
        child obj2 = new child("shanker","sai");
                String a =obj.a;
                String b = obj.b;
                String c =obj2.a;
                String d =obj2.b;
                System.out.println(a+" "+b+" "+c+"  "+ d);
    }
}
class parent{
    String a;
}
class child extends parent{
    String b;
    child(String a,String b){
        this.a=a;
        this.b=b;
    }
    child(String b){
        this.b=b;
    }
}