import java.util.*;
import java.util.Scanner;

class String_palindrome 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1="";
        int m=0;
        System.out.println("enter the string:");
        String s = sc.nextLine();
        int n = s.length();
       for(int i=n-1;i>=0;i--)
       {
        s1 = s1+s.charAt(i);
       }
       for(int i=0;i<n;i++)
       {
        if(s.charAt(i)==s1.charAt(i))
        {
            continue;
        }
        else
        {
            m=1;
        }
       }

       if(m==0)
       {
        System.out.println(s+" is a palindrome");
       }
       else
       {
        System.out.println(s+" is not a palindrome");
       }
    }
}
