import java.util.ArrayList;
import java.util.Arrays;

public class DupliCount {
    public static void main(String[] args) {
        int [] a={2,3,2,1,2,3};
        ArrayList<Integer> ans=duplicates(a,a.length);
        System.out.println(ans);
    }
    static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        //n= arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int r;
            if(arr[i]==arr[i+1]){
                r=arr[i];
                result.add(r);
            }

        }
        if(result.isEmpty()){
            result.add(-1);
        }
    return result;

}}
