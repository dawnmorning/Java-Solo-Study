package chap_04;

public class _03_SwitchCase {
    public static void main(String[] args) {
        int ranking = 4;
        if (ranking == 4){
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        }
        else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("완료");
        ranking = 5;

        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
            case 2:
                System.out.println("반액 장학금");
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("case문 조회 완료");

        int grade = 1;
        int price = 7000;

        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
    }
}
