import java.util.ArrayList;
import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int[] a={3,5,6,1,7};
        ArrayList<Integer> result=minmax1(a);
        System.out.println(result);
        ArrayList<Integer> result2=minmax2(a);
        System.out.println(result2);

    }
    static ArrayList<Integer> minmax1(int [] a){
        int min=a[0];
        int max=a[0];
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        result.add(min);
        result.add(max);
        return result;

    }
    static ArrayList<Integer> minmax2(@org.jetbrains.annotations.NotNull int [] a){
        ArrayList<Integer> result=new ArrayList<Integer>();
        int min=a[0];
        int max=a[0];
        for(int i=1;i<a.length;i++){
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
        result.add(min);
        result.add(max);
        return result;
    }

}
