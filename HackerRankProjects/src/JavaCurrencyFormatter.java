import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Currency us= Currency.getInstance("USD");
        NumberFormat usd =NumberFormat.getCurrencyInstance(Locale.US);
        usd.setCurrency(us);

        Currency india=Currency.getInstance("INR");
        Locale indian = new Locale("en", "IN");
        NumberFormat inr= NumberFormat.getCurrencyInstance(indian);
        inr.setCurrency(india);

        Currency china=Currency.getInstance("CNY");
        NumberFormat cny=NumberFormat.getCurrencyInstance(Locale.CHINA);
        cny.setCurrency(china);

        Currency france = Currency.getInstance("EUR");
        NumberFormat eur =  NumberFormat.getCurrencyInstance(Locale.FRANCE);
        eur.setCurrency(france);

        System.out.println("US: " + usd.format(payment));
        System.out.println("India: " + inr.format(payment));
        System.out.println("China: " + cny.format(payment));
        System.out.println("France: " + eur.format(payment));
    }
}


