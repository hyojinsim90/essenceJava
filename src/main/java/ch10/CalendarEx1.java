package ch10;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args){
        // 기본적으로 현재날짜와 시간으로 설정된다
        Calendar today = Calendar.getInstance();

        System.out.println("이 해의 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR)); // 이 해의 몇째 주 : 2
        System.out.println("이 달의 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH)); // 이 달의 몇째 주 : 2
        System.out.println("요일(1~7, 1: 일요일) : " + today.get(Calendar.DAY_OF_WEEK)); // 요일(1~7, 1: 일요일) : 7
        // 1:일요일, 2:월요일, ... 7:토요일
        System.out.println("오전_오후(0:오전, 1:오후) : " + today.get(Calendar.AM_PM)); // 오전_오후(0:오전, 1:오후) : 1
        System.out.println("시간(0~11) : " + today.get(Calendar.HOUR)); // 시간(0~11) : 9
        System.out.println("시간(0~24) : " + today.get(Calendar.HOUR_OF_DAY)); // 시간(0~24) : 21
        System.out.println("1000분의 1초 : " + today.get(Calendar.MILLISECOND)); // 1000분의 1초 : 813
        // 천분의 1초를 시간으로 표시하기 위해 3600000(60*60)으로 나누었다
        System.out.println("Timezone (-12~+12) : " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // Timezone (-12~+12) : 9
        System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE)); // 이 달의 마지막 날 : 31


    }
}
