package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
//        name 이라는 문자열 변수 선언
        String name;
        name = "dawn";
        int hour = 15;
        System.out.println(name + "님 배송이 " + hour + "시에 시작되었습니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + " 님의 평균 점수는 " + score + " 점입니다." );
        System.out.println("학점은 " + grade +" 입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요?" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
//        3.12346
//        깊은 데이터가 아니라면 float 활용
        /*  소문자도 가능 */

        System.out.println(d);
        System.out.println(f);

//        int i = 1000000000000;
//        -21억 ~ 21억 사이만 가능
        long l = 1000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);
    }
}
