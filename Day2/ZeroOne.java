import java.util.*;
public class ZeroOne{
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,1,1};
        int[] newArray = new int[nums.length];
        int zeroCount = 0;

        // Count zero and one
        for(int num:nums){
            if(num==0) zeroCount++;
        }

        // No need to fill zero as array is zero by default
        // Fill one in newArray 
        for(int i=zeroCount;i<nums.length;i++) newArray[i] = 1;

        // Print newArray
        System.out.println(Arrays.toString(newArray));
    }
}