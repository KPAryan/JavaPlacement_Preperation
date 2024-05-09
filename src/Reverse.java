public class Reverse {
    public static void main(String[] args) {
        /*int n=1534236469;
        int t=n;
        int count=0;
        int ans=0;
        if(t<0){
            t=Math.abs(n);
        }
        while (t > 0) {
            int rem =t%10;
            t=t/10;
            ans=ans*10+rem;
        }
        if(n<0){
            int o = (~(ans - 1));
            System.out.println(o);
        }
        else{
        System.out.println(ans);}*/
        int n=121;
        System.out.println(palindromeNumber(n));
    }
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int t=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        if(ans!=t){
            return false;
        }
        return true;
    }
}
