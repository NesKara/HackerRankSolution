import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.time.DayOfWeek;
        import java.time.LocalDate;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Scanner in=new Scanner(System.in);
        int mm=month;
        int dd=day;
        int yy=year;
        LocalDate localDate= LocalDate.of(yy,mm,dd);
        DayOfWeek dow =localDate.getDayOfWeek();
        String res = dow.toString();
        System.out.println(res);
        return res;
    }

}

public class JavaDateFormatter {
    public static void main(String[] args) throws IOException {
        //   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = 5;

        int day = 25;

        int year = 1995;

        String res = Result.findDay(month, day, year);

        //bufferedWriter.write(res);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}