public class Smallest{
    public static void main(String[] args) {
        int[] nums = new int[]{5,6,5,8,2,3};
        int ans = Integer.MAX_VALUE;

        for(int num:nums){
            if(num<ans) ans = num;
        }

        System.out.println(ans);
    }
}
