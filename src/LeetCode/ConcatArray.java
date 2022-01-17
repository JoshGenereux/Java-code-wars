package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[nums.length * 2];
        int count = 0;
        for(int i = 0; i < nums.length * 2; i++){
            if(i >= nums.length){
                ans[i] = nums[count];
                count++;
            } else {
                ans[i] = nums[i];
            }
        }
        return ans;
    }

}
