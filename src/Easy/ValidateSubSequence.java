package Easy;

import java.util.List;

public class ValidateSubSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence){
        int arrayP = 0;
        int sequenceP = 0;
        while(arrayP < array.size() && sequenceP < sequence.size()){
            if(array.get(arrayP) == sequence.get(sequenceP)){
                sequenceP++;
            }
            arrayP++;
        }
        if(sequenceP == sequence.size()){
            return true;
        }
        return false;
    }

}
