package chpa_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I am dawn";
        System.out.println(s);

        System.out.println(s.length());

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.contains("dawn"));
        System.out.println(s.contains("Dawn"));

        System.out.println(s.indexOf("dawn"));

        System.out.println(s.indexOf("c#")); // -1

        System.out.println(s.indexOf("dawn")); // 처음 일치하는 정보
        System.out.println(s.lastIndexOf(("dawn"))); // 마지막으로 일치하는 정보

        System.out.println(s.startsWith("I")); // 그걸로 시작하는지
    }
}
