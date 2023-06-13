package assignment8;

import java.util.Arrays;

public class Check {
    public static void main(String args[])
    {
        String a="bat";
        String b="tab";
        char[] x=a.toCharArray();
        char[] y=b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y)) {
            System.out.println("true");
        }
        else
            System.out.println("false");
        }
    }

