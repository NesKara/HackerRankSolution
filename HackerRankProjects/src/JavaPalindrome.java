import java.io.*;
        import java.util.*;

public class JavaPalindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       /*  boolean isPalindrome=true;
        Enter your code here. Print output to STDOUT. */
       /* for(int i=0;i<A.length()/2;i++)
        {
            if (A.charAt(i)==A.charAt(A.length()-1-i))
            {
                isPalindrome=true;
            }
            else
                isPalindrome=false;
        }
           if(isPalindrome)
        System.out.println("Yes");
        else
            System.out.println("No");
         */

       //Another Solution
        String reverseA=new StringBuilder(A).reverse().toString();
        if(A.equals(reverseA))
        {
            System.out.println("Yes");

        } else
            System.out.println("No");

    }
}


