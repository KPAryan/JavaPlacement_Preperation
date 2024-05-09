import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] a={3,2,4};
        int [] result=twoSum(a,6);
        System.out.println(Arrays.toString(result));
    }
    static int[] twoSum(int[] nums, int target) {
       int[] result=new int[2];
       for(int i=0;i< nums.length-1;i++){
           if(nums[i]+nums[i+1]==target){
               result[0]=i;
               result[1]=i+1;
           }
           //return result;

       }
        return result;
    }
}
