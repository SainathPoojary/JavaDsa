import java.util.*;
public class ReverseArray{


    public static void reverseArray(int[] arr){

        // Brute force approach [Space: O(n)]
        int[] rev = new int[arr.length];

        for(int i=0;i<rev.length;i++){
            rev[i] = arr[arr.length-1-i];
        }

        System.out.println(Arrays.toString(rev));

        // Swaping Approach [Space: O(1)]
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {
        reverseArray(new int[]{5,4,3,2,1});
    }
}