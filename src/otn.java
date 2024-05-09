public class otn {
    static void myrec(int n){
        if(n>0){

            myrec(n-1);
            System.out.print(n+" ");
        }
        return;
    }
    static void nnsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        nnsum(i+1,n,sum);
    }
    static void revmyrec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        revmyrec(n-1);

    }
    static int myfactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int f1=myfactorial(n-1);
        int fresult=n*f1;
        return fresult;
    }
    static void myfibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        myfibo(b,c,n-1);
    }

    public static void main(String[] args) {
        myrec(5);
        System.out.println();
        revmyrec(10);
        System.out.println();
        nnsum(1,5,0);
        int x=myfactorial(5);
        System.out.println(x);
        int a=0,b=1,n=5;
        myfibo(a,b,n);
    }
}
