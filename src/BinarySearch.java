import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[]a ={1,3,5,2,4,6,9,7};
        int t=8;
        System.out.println(mybsearch(a,t));
    }
    static int mybsearch(int[] a,int t){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
       //return a[1];
        int start=0;
        int end=a.length-1;
        int ta=1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(t>a[mid]){
                start=mid+1;
            } else if (t<a[mid]) {
                end=mid-1;

            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
