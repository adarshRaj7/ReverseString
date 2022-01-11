import java.io.*;
import java.util.*;
import java.lang.*;
public class Reverse
{

    
    public static void main(String args[]) {
        Scanner scn =new Scanner (System.in);
        System.out.println("Enter a string");
        String s=scn.next();
        s=reverseIt(s);
        System.out.println(s);
    }

    public static String reverseIt(String s) {
        int l=s.length();
        String rev="";
        for(int i=l-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        return rev;
        
    }

}