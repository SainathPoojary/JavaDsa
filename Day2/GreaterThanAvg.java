import java.util.*;
public class GreaterThanAvg{
    public static void main(String[] args) {
        // int[] nums = {1,2,3,4,5,6};
        // int sum=0;
        // for(int i = 0; i<nums.length; i++){
        //     sum+=nums[i];
        // }
        // double avg = sum/nums.length;

        // // Search for element in Array
        // System.out.print("Numbers: ");
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i]>avg){
        //         System.out.print(nums[i]+" ");
        //     }
        // }
        
        // ============= OR ===============
        int[] nums = {1,2,3,4,5,6};
        double avg =Arrays.stream(nums).sum()/nums.length;
        System.out.print("Numbers: ");
        for(int num:nums){
            if(num>avg) System.out.print(num+" ");
        }
        System.out.println();
    }
}