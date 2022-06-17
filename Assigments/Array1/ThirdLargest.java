public class ThirdLargest{

    public static int thirdLargest(int[] arr){

        // 3 variables to hold the value of 3 largest element of array
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        int l3 = Integer.MIN_VALUE;

        // Iterate over a loop O(n)
        // Example
        /* 
            arr => 2 4 1 3 5
            i1 => -2147483648 -2147483648 -2147483648
            i2 => 2 -2147483648 -2147483648
            i3 => 4 2 -2147483648
            i4 => 4 2 1
            i5 => 4 3 2
            ans => 3
        */
        for(int i=0; i<arr.length; i++){
            if(arr[i]>l1){    
                l3 = l2;
                l2 = l1;
                l1 = arr[i];
            }else if(arr[i]>l2){
                l3 = l2;
                l2 = arr[i];
            }
            else if(arr[i]>l3){
                l3 = arr[i];
            }
        }

        return l3;

    }

    public static void main(String[] args) {
        System.out.println("2 4 1 3 5");
        System.out.println(thirdLargest(new int[]{2,4,1,3,5}));
    }
}