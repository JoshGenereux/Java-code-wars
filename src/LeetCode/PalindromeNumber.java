package LeetCode;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 0;
        boolean palindrome = isPalindrome(num);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        } else if(x == 0){
            return true;
        }
        System.out.println("passed if statement");
        int reverse = 0;
        int num = x;
        while(num != 0){
            reverse = reverse * 10 + (num % 10);
            System.out.println("reverse = " + reverse);
            num /= 10;
            System.out.println("num = " + num);
            if(reverse == x){
                return true;
            }
        }
        return false;
    }
}
