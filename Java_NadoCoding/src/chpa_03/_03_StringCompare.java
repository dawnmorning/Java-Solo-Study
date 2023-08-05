package chpa_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        // 대소문자 상관없이 비교
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234"; // s1과 s2는 똑같은 곳을 참조하는 것
        s2 = "1234";

        System.out.println(s1.equals(s2)); // true, 내용을 비교하는 것
        System.out.println(s1 == s2); // true, 참조가 같은 지를 비교하는 것

        s1 = new String("1234"); // 참조하는 것이 다름
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

        //
    }
}
