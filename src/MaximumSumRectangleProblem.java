import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumRectangleProblem {
    public static void main(String[] args) {
        int[][] a={{1,2,-1,-4,-20},
                {-8,-3,4,2,1},
                {3,8,10,1,3},
                {-4,-1,1,7,-6}};
        System.out.println(maximuSumRectangle(4,5,a));
    }
    static int maximuSumRectangle(int R,int C,int[][] a){
        int sum[]=new int[R];
        int maxSum=Integer.MIN_VALUE;
        //int cuMaxSum;
        for(int cStart=0;cStart<a.length;cStart++){
            Arrays.fill(sum,0);
            for(int cEnd=cStart;cEnd<C;cEnd++){
                for(int row=0;row<R;row++){
                    sum[row]+=a[row][cEnd];
                }
               int cuMaxSum=kadanes(sum);
               maxSum=Math.max(maxSum,cuMaxSum);
            }

        }
        return maxSum;
    }
    static int kadanes(int[] a){
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here= 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;

    }
}
