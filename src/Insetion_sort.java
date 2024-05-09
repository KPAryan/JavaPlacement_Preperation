import java.util.Arrays;

public class Insetion_sort {
    public static void main(String[] args) {
        int[] a={5,3,4,1,2};
        myinsetionsort(a);
    }
static void myinsetionsort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
                else{
                    break;
                }
            }
        }
    System.out.println(Arrays.toString(a));
}
}
