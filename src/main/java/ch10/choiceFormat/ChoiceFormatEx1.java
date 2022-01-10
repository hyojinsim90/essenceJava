package ch10.choiceFormat;

import java.text.ChoiceFormat;

// 특정 범위에 속하는 값을 문자열로 변환해줌
public class ChoiceFormatEx1 {
    public static void main (String[] args) {
        double[] limits = {60, 70, 80, 90}; // 낮은 값부터 큰 값의 순서로 적어야한다.
        // 60~69, 70~79, 80~89, 90~의 범위가 정의됨

        String[] grades = {"D", "C", "B", "A"};
        // limits, grades간의 순서와 개수를 맞추어야 한다.

        // limits -> 범위의 경계값이 저장되는 제 사용. double형 오름차순 정렬되어 있어야한다.
        // grades ->범위에 포함된 값을 치환할 문자열. limits 갯수와 일치해야한다.

        int[] scores = { 100, 95, 88, 70, 52, 60, 70 };

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for (int i=0; i<scores.length; i++) {
            System.out.println(scores[i] + " : " + form.format(scores[i]));
        }
        /*
        * 결과
          100 : A
          95 : A
          88 : B
          70 : C
          52 : D
          60 : D
          70 : C
        * */
    }
}
