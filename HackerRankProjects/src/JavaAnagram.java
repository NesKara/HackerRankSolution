import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        if (a.length() != b.length()) {
            return false;
        }

        char[] ca = a.toLowerCase().toCharArray();
        char[] cb = b.toLowerCase().toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return (new String(ca)).equals(new String(cb));


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
