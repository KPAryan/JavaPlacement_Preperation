import java.util.Arrays;

public class arr_Revm {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6};
//        int m=3;
//        int j=a.length;
//        int b[]=new int[j];
//        for(int i=3;i<=j;) {
//            if (i == m) {
//                b[m] = a[j - 1];
//            } else {
//                b[i] = a[i];
//            }
//        }
//        String c= Arrays.toring(b);
//        System.out.println(c);
        System.out.println(Arrays.toString(reverse(a)));
    }
    public static int[] reverse(int arr[]){
        int j = arr.length-1;
        for(int i=3;i<arr.length;i++){
            swap(arr, i ,j);

        }
        return arr;
    }
    public static void swap(int arr[],int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
