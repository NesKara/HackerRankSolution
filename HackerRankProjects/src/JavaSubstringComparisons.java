
import java.util.*;
import java.util.Collections;
public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        ArrayList<String> wordList=new ArrayList<String>();
        String [] list=new String[];
        for (int start=0;start<s.length()-2;start++)
        {
            list[start]=s.substring((start,start+3));
        }
        Collections.sort(wordList);
       smallest=wordList.get(0);
        largest=wordList.get(wordList.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}