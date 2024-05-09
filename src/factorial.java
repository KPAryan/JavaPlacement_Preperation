public class factorial {
    public static void main(String[] args) {
        int n=1;
        System.out.println(myfact(n));
    }
    static int myfact(int num){
        int res=1;
        if(num==1){
            return 1;
        }
        for(int i=2;i<=num;i++){
            res *=i;
        }

            return res;

    }
}
