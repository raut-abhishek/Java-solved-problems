// Pair with the given Sum- Brute force

import java.util.Arrays;

public class SumPair {

    public static int[] findPair(int[] nums, int target){
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length-1; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {nums[i], nums[j]};
                }
            }
        }
        return new int[]{-1};
    }



    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int target = 11;

        System.out.println(Arrays.toString(findPair(nums, target)));
        
    }
}
