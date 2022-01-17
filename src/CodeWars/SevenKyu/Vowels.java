package CodeWars.SevenKyu;

import java.util.HashSet;
import java.util.Set;

public class Vowels {
    public static void main(String[] args) {
        System.out.println(getCount("test"));
    }

    public static int getCount(String str){
        int vowelsCount = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');


        for(int i = 0; i < str.length(); i++){
            if(set.contains(str.charAt(i))){
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
