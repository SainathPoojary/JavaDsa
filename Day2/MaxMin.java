import java.util.*;
public class MaxMin{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get Length of array
        System.out.print("Enter length of array: ");
        int n = scan.nextInt();
        int[] nums = new int[n];

        // Get numbers
        System.out.print("Enter numbers: ");
        for(int i=0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        
        scan.close();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            if(num>max) max=num;
            if(num<min) min=num;
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}