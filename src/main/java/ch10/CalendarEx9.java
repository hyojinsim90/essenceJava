package ch10;

public class CalendarEx9 {
    public static void main(String[] args) {
        System.out.println("2014. 5. 31 : " + getDayOfWeek(2014, 5, 31)); // 2014. 5. 31 : 7
    }

    public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 각 달이 마지막 일

    private static int getDayOfWeek(int year, int month, int day) {
        // 1~7의 값을 반환한다. 결과가 1이면 일요일이다.
        return convertDateToDay(year, month, day)%7 + 1;
    }

    private static boolean isLeapYear(int year) {
        return ((year%4==0) && (year%100!=0) || (year%400==0));
    }

    private static int convertDateToDay(int year, int month, int day) {
        System.out.println("year : " + year); // 2014
        System.out.println("month : " + month); // 5
        System.out.println("day : " + day); // 31

        int numOfLeafYear = 0; // 윤년의 수

        // 전년도까지의 윤년의 수를 구한다.
        for (int i = 1; i < year; i++) {
            if(isLeapYear(i)){
                numOfLeafYear++;
            }
        }
        System.out.println("numOfLeafYear : " + numOfLeafYear); // numOfLeafYear : 488

        // 전년도까지의 일수를 구한다.
        int toLastYearDaySum = (year-1) * 365 + numOfLeafYear; ///
        System.out.println("toLastYearDaySum : " + toLastYearDaySum); // toLastYearDaySum : 735233

        // 올해의 현재 월까지의 일수 계산
        int thisYearDaySum = 0;

        for(int i = 0; i < month-1; i ++ ){
            thisYearDaySum+= endOfMonth[i];
        }
        System.out.println("thisYearDaySum : " + thisYearDaySum); // thisYearDaySum : 120

        // 윤년이고, 2월이 포함되어 있으면 1일을 증가시킨다.
        if(month > 2 && isLeapYear(year))
            thisYearDaySum++;
        thisYearDaySum+=day;
        System.out.println("thisYearDaySum : " + thisYearDaySum); // thisYearDaySum : 151

        return toLastYearDaySum+thisYearDaySum;
    }


}
