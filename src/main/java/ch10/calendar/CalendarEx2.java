package ch10.calendar;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args){
        // 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워두었다.
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        // month의 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정해야한다.
        // date1.set(2015, 7, 15); // 2015년 8월 15일로 날짜를 설정한다.
        date1.set(2015, 7, 15);
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, "); // date1은 2015년 8월 15일 토요일이고,
        System.out.println("date2은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다. "); // date2은 2022년 1월 8일 토요일입니다.

        // 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변화해야한다.
        long diffrence = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("그날(date1)부터 지금(date2)까지 " + diffrence + "초가 지났습니다. "); // 그날(date1)부터 지금(date2)까지 202003200초가 지났습니다.
        System.out.println("일(day)로 계산하면 " + diffrence / (24 * 60 * 60) + "일입니다"); // 일(day)로 계산하면 2338일입니다
        // 1일 = 24*60*60

    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " +  (date.get(Calendar.MONDAY) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
