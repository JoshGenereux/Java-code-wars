package CodeWars.EightKyu;

public class EvenOrOdd {

    public static void main(String[] args) {
        System.out.println(evenOrOdd(6));
        System.out.println(evenOrOdd(7));
    }

    public static String evenOrOdd(int number){
        String answer = "";
        if(number % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}
