import java.util.Arrays;

public class Ceil {
    public static void main(String[] args) {
        int[]a ={3,4,4,7,8,10};
        int t=5;
        System.out.println("Array Position"+mybsearch(a,t));
        int x=mybsearch(a,t);
        System.out.println("and the value is: "+a[x]);
    }
    static int mybsearch(int[] a,int t){
        //Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
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
        return start;
    }
}
