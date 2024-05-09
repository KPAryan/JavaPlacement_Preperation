
public class armstrong {
    public static void main(String[] args) {
        int a=16345;
        int b=a;
        double ans=0;
        String s=Integer.toString(a);
        int c=s.length();
        System.out.println(c);
        while(a>0){
            int rem=a%10;
            double x= Math.pow(rem,c);

                ans=ans+x;
            a=a/10;
        }
        System.out.println(ans);
        System.out.println(b);
        if(b==ans){
            System.out.println(b+" Is a armstrong number");
        }
        else{
            System.out.println(b+" Number is not a a armstrong number");
        }
    }
}
