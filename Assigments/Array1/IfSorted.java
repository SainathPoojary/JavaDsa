public class IfSorted{
    public static boolean arraySortedOrNot(int[] arr, int n){
        for(int i=1; i<n; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(arraySortedOrNot(new int[]{90, 80, 100, 70, 40, 30},6));
    }
}   