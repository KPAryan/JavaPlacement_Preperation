import java.util.*;
public class Solution {


    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int c=0;c<=n;){
            a[c]=sc.nextInt();
            c++;
        }
        for (int c=0;c<=n;){
            System.out.println(a[c]);
            c++;
        }
        int p=solution(a);
        System.out.println(p);
    }
    static int solution(int[] arr){
        int l=arr.length;
        int sum=0;
        for(int i=0;i<=l;i++){
            int temp=arr[i];
            sum=sum+temp;
        }
        return sum;
    }

}
