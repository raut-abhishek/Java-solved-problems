import java.util.Arrays;

public class TwoSum {

    static int[] getSum(int[] arr, int target){
        for(int  i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){

                    return new int[]{i,j};
                    // return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 17;
        int[] result = getSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
    
}
