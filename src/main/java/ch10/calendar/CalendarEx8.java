package ch10.calendar;

public class CalendarEx8 {
    public static void main(String[] args) {
        String date1 = "201508";
        String date2 = "201405";

        // 년과 월을 substring 으로 잘라서 정수로 변환한다
        // 년에 12를 곱해서 월로 변환한 다음에 뺄셈을 하면 개월차를 구할 수 있다.
        int month1 = Integer.parseInt(date1.substring(0,4)) * 12 + Integer.parseInt(date1.substring(4));
        System.out.println(date1.substring(0,4)); // 2015 -> 기준이 0부터 시작. 0번째 단어부터 4번째인 0이전까지임 (0이 포함 안됨)
        System.out.println(date1.substring(4)); // 08 -> 4번째 단어엔 0 이전의 5까지 자름
        System.out.println(month1); // 24188

        int month2 = Integer.parseInt(date2.substring(0,4)) * 12 + Integer.parseInt(date2.substring(4));
        System.out.println(month2); // 24173

        System.out.println(date1 + "과 " + date2 + "의 차이는 " + Math.abs(month1-month2) + "개월 입니다."); // 201508과 201405의 차이는 15개월 입니다.
    }
}
