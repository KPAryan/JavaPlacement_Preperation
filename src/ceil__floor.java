import java.util.Arrays;

public class ceil__floor {
    public static void main(String[] args) {
        int[]a ={3,4,4,7,8,10};
        int t=2;
        System.out.println(Arrays.toString(getFloorAndCeil(a,6,t)));
    }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int start=0;
        int end=n-1;
        //int ta=1;
        int[] y=new int[2];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(x>a[mid]){
                start=mid+1;
            } else if (x<a[mid]) {
                end=mid-1;

            }
            else {
                y[0]=a[mid];
                y[1]=a[mid];
                return y;
                //break;
            }

        }
        //int[] y=new int[2];
        if(x<a[0]){
            y[0]=-1;
            y[1]=a[start];
        }

        else if(x>a[0]){
            //int[] y=new int[2];
            y[0]=a[end];
            y[1]=a[start];}
        return y;

    }
}
