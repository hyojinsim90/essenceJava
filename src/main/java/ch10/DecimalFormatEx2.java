package ch10;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");
            System.out.println("num : " + num); // num : 1234567.89
            System.out.printf("1,234,567.89 -> ");

            double d = num.doubleValue();
            System.out.printf(d + " -> ");

            System.out.println(df2.format(num));
            // 1,234,567.89 -> 1234567.89 -> 1.235E6
        } catch (Exception e){}
    }
}
