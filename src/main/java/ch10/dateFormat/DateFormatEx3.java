package ch10.dateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 문자열을 날짜Date인스턴스로 바꿔줌
public class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2015년 8월 23일"); // 지정된 형식이 맞는지 확인 + string을 Date 형식으로 바꿔줌
            System.out.println(df2.format(d)); // 2015/08/23
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
