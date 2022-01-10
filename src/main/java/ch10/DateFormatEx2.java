package ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Calendar를 Date로 변환
public class DateFormatEx2 {
    public static void main (String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, 9, 3); // 2005년 10월 3일 - Month는 0~11의 의미를 갖는다.

        Date day = cal.getTime(); // Calendar를 Date로 변환

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
        System.out.println(sdf1.format(day)); // 2005-10-03 10:04:28 오후
    }


}
