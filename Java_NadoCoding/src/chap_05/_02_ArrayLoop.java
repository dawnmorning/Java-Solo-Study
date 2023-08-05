package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] Coffees = {"아메리카노", "카페라떼"};
        for (int i = 0; i < Coffees.length; i++){
            System.out.println(Coffees[i]);
        }
        for (String Coffee : Coffees){
            System.out.println(Coffee);
        }
        for (String Coffee : Coffees
        ){
            System.out.println(Coffee);
        }
    }
}
