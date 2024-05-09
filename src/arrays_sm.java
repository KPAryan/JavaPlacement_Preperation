import java.util.Collections;
import java.util.Arrays;
public class arrays_sm {
    public static void main(String[] args) {

        Integer[] x={1,2,0,3,4,5,6};
        Integer[] y={1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        int m=y.length;
        int n= x.length;
        //System.out.println(Arrays.toString(getSecondOrderElements(n,x)));
        System.out.println(Arrays.toString(getSecondOrderElements(m,y)));
    }
        public static int[] getSecondOrderElements(int n, Integer []a) {
            // Write your code here.
            int ss= a[0];
            int sg=-1;;
            int s=a[0];
            int l=a[0];;
            int[] o=new int[2];
            for(int i=0;i<n;i++){

                if(a[i]>l && a[i]>s){
                    sg=l;
                    l=a[i];
                }
                if(a[i]>s && a[i]>l){
                    ss=s;
                    s=a[i];
                }
            }
            o[0]=sg;
            o[1]=ss;
            return o;

        }
}
