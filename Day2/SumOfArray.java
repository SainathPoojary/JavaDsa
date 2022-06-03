import java.util.*;
public class SumOfArray{
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

        // Calculate Sum
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        System.out.println("Sum of array: "+sum);
    }
}