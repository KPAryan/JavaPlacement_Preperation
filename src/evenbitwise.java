public class evenbitwise {
    public static void main(String[] args) {
        System.out.println(even(7));
        System.out.println(mulbytwo(5));
        System.out.println(divbytwo(8));
    }
    static boolean even(int n){
        if((n&1)!=1){
            return true;
        }
        return false;
    }
    static int mulbytwo(int n){
        int result=n<<1;
        return result;
    }
    static int divbytwo(int n){
        int result=n>>1;
        return result;
    }

}
