package ch10.calendar;

import java.util.Calendar;

public class CalendarEx4 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2015, 7, 15); // 2015년 8월 31일
        // 8월으로 들어간다는 것 주의!!

        System.out.println("= 31일 후(roll) =");
        date.roll(Calendar.DATE, 31); // 2015년 8월 31일
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) =");
        date.add(Calendar.DATE, 31); // 2015년 10월 1일
        System.out.println(toString(date));

        // add와 roll의 차이
        // add(int field, int amount)를 사용하면 지정한 필드의 값을 원하는 만큼 증가 또는 감소시킬수 있기 때문에 add메서드를 이용하면 특정 날짜 똔느 시간을 기점으로 해서 일정 기간 전후의 날짜와 시간을 알아낼 수 있다.
        // roll(int field, int amount)도 지정한 필드의 값을 증가 또는 감소시킬 수 있는데, add 메서드와의 차이점은 다른 필드에 영향을 미치지 않는다는 것이다.
        // 단, 한가지 예외가 있는데 일 필드가 말일일때, roll 메서드를 이용해서 월 필드를 변경하면 일 필드에 영향을 미칠 수 있다.
    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONDAY) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
