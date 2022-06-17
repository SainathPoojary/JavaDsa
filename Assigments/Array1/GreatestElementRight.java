import java.util.*;
public class GreatestElementRight{

    public static void greatestElementRight(int[] arr){

        // Brute Force
        // for(int i=0; i<arr.length; i++){
        //     int l = 0;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[j]>l){
        //             l=arr[j];
        //         }
        //     }
        //     arr[i] = l;
        // }
        // System.out.println(Arrays.toString(arr));


        // O(n) Time Complexity
        int largest = 0;
        for(int i=arr.length-1; i>=0; i--){
            int temp = largest;
            if(arr[i]>largest){
                largest = arr[i];
            }
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        greatestElementRight(new int[]{7,5,8,9,6,8,5,7,4,6});
    }
}