import java.util.*;
public class sumn {
    public static int Solution(int[] arr,int N){
        //int N=arr.length;
        int sum=0;
        for(int i=0;i<N;i++){
            sum=sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] a=new int[N];
        for (int c=0;c<N;){
            a[c]=sc.nextInt();
            c++;
        }
        int p=Solution(a,N);
        System.out.println(p);
    }

}
