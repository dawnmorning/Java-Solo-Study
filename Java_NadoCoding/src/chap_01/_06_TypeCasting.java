package chap_01;

public class _06_TypeCasting {
    public static void main(String[] args) {
//        형변환 TypeCasting
//        정수형에서 실수형, 실수형에서 정수형으로

        // int to float or double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int) score_d);
        System.out.println((int) score_f);

        score = 93 + (int) score_d;
        System.out.println(score);

        score_d = 93 + 98.8;
        System.out.println((score_d));

        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int) score_d;
        // double -> float -> long -> int (큰 범위에서 작은 범위로, 수동 형변환)

        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        int i = Integer.parseInt("93");
        System.out.println(i);
    }
}
