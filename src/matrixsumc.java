import java.util.Arrays;

public class matrixsumc {
    public static void main(String[] args) {
        System.out.println(sumMatrix(4,7));
    }
    static long sumMatrix(long n, long q) {
        // code her
        //int p=(int)n;
        long count=0;
        //long[][] a;
        //a=new long[p][p];
        //long count=0;
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                //a[i][j] = i + j;
                long s=i+j;
                //long count=0;
                if ( s== q) {
                    count=count+1;

                }}

        }*/
        int i=1,j=1;
        while(i<=n && j<=n){
            long t=i+j;
            j++;
            if ( t== q) {
                count=count+1;
            }
            i++;
            j++;
        }
        //System.out.println(Arrays.toString(a));
        return count;



    }
}
