import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class maximumofsubarr {
    public static void main(String[] args) {
        int[] a={1,2,3,1,4,5,2,3,6};
        int n=a.length;
        System.out.println(brut(a,n,3));
        System.out.println(optimized(a,n,3));
        int[] arr={1,2,3,2,5};
        System.out.println(maxSubarraySum(arr,arr.length));
    }
    static ArrayList<Integer> brut(int []a,int n,int k){
        int max=0;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                max= Math.max(max,a[j]);
            }
            ans.add(max);
        }
        return ans;
    }
    static ArrayList<Integer> optimized(int []a,int n,int k){
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Deque<Integer> dq=new ArrayDeque<Integer>();
        int i=0,j=0;
        while (j<n){
            while(dq.size()>0 &&dq.getLast()<a[j]){
                dq.pollLast();
            }
            dq.addLast(a[j]);
            if(j-i+1==k){
                ans.add(dq.getFirst());
                if(dq.getFirst()==a[i]){
                    dq.pollFirst();
                }
                i++;
            }
            j++;
        }
        return ans;
    }
    static long maxSubarraySum(int arr[], int n){

        // Your code here
        long maxs=arr[0];
        long curs=arr[0];
        for(int i=1;i<n;i++){
            curs=curs+arr[i];
            curs=Math.max(curs,arr[i]);
            maxs=Math.max(maxs,curs);
        }
        return maxs;

    }
}
