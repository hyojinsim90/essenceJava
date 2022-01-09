package ch10;

import java.util.Calendar;

public class CalendarEx7 {
    public static void main(String[] args){
        args = new String[2];
        args[0] = "2022";
        args[1] = "1";
        if(args.length != 2){
            System.out.println("Usage : java CalendarEx7 2022 1");
            return;
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        Calendar sDay = Calendar.getInstance(); // 시작일
        Calendar eDay = Calendar.getInstance(); // 끝일

        // 월의 경우, 0부터 11까지의 값을 가지므로 1을 빼줘야한다.
        // 예를들어, 2004년 11월 1일은 sDay.set(2014, 10, 1);과 같이 해줘야 한다.

        sDay.set(year, month-1, 1); // 입력월의 1일로 설정한다. -> 2022년 1월 1일
        System.out.println(toString(sDay)); // 2022년 1월 1일

        // 입력어의 말일로 설정한다.
        eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE)); // 2022년 1월 31일
        System.out.println(toString(eDay)); // 2022년 1월 31일

        // 1일이 속한 주의 일요일로 날짜 설정.
        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1); // 7일을 뺀  2022년 12월 25일
        // 1:일요일, 2:월요일, ... 7:토요일
        System.out.println(sDay.get(Calendar.DAY_OF_WEEK)); // 1
        System.out.println(toString(sDay)); // 2021년 12월 26일

        // 말일이 속한 주의 토요일로 날짜설정
        eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK)); // 7에서 2를 뺀 5. 2022년 2월 5일
        System.out.println(eDay.get(Calendar.DAY_OF_WEEK)); // 7
        System.out.println(toString(eDay)); // 2022년 2월 5일

        System.out.println("         " + year + "년 " + month + "월");
        System.out.println("  SU  MO  TU  WE  TH  FR  SA");

        // 시작 일부터 마지막 일까지(sDay <= eDay ) 1일씩 증가시키면서 일(Calendar.DATE)을 출력
        for (int n=1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {

            int day = sDay.get(Calendar.DATE);
            System.out.print((day < 10)? "   " + day : "  " + day );
            if(n++%7==0) System.out.println(); // 7일치를 찍고 나서 줄을 바꾼다.

        }
        /*
                 2022년 1월
          SU  MO  TU  WE  TH  FR  SA
          26  27  28  29  30  31   1
           2   3   4   5   6   7   8
           9  10  11  12  13  14  15
          16  17  18  19  20  21  22
          23  24  25  26  27  28  29
          30  31   1   2   3   4   5
        * */

    }

    private static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONDAY) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
