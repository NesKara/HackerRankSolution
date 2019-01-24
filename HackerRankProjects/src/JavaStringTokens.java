import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        //He is a very very good boy, isn't he?

        String [] test=new String[s.length()];



            test=s.split(" ");
            
            for (String item : test)
            {

                for(int j=0;j<item.length();j++)
                {
                    if(   item.charAt(j)>=Character.toLowerCase(33) && item.charAt(j)<= Character.toLowerCase(64))
                    {

                    }

                }
                    System.out.println(item);


            }
            scan.close();
    }
}

