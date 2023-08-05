package chpa_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I am dawn";
        // 문자열 변환
        System.out.println(s.replace("I","You"));
        System.out.println(s.substring(3)); // 인덱스 기준 5부터 시작, 이전 내용은 삭제 (잘라내기)
        System.out.println(s.substring(s.indexOf("dawn")));
        System.out.println(s.substring(s.indexOf("I"), s.indexOf("dawn")));
        // 직전까지, 슬라이싱 개념

        // 공백 제거
        s= "             I am dawn";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + s2);
        System.out.println(s1 + ", " + s2);
        System.out.println(s1.concat(", ").concat(s2));
    }
}
