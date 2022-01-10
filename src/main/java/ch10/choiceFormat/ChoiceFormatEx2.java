package ch10.choiceFormat;

import java.text.ChoiceFormat;

// 패변 대신 패턴을 사용해서 ChoiceFormat사용하는 법
public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        String pattern = "60#D|70#C|80<B|90#A"; 
        // # : 경계값을 범위에 포함시킴
        // < : 범위에 포함 안함
        int[] scores = { 91, 90, 80, 88, 70, 52, 60};

        ChoiceFormat form = new ChoiceFormat(pattern);

        for (int i = 0; i < scores.length; i++ ) {
            System.out.println(scores[i] + " : " + form.format(scores[i]));
        }

        /**
         * 결과
         * 91 : A
         * 90 : A // 90은 A에 포함된
         * 80 : C // 80은 B가 아니라 C에 포함됨
         * 88 : B
         * 70 : C 
         * 52 : D // 60 아래여도 D에 포함됨
         * 60 : D
         */
    }
}
