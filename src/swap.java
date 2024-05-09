public class swap {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        swapn(a,b);
    }
    static void swapn(int a, int b){
        int t=a;
        a=b;
        b=t;
        System.out.println(a);
        System.out.println(b);
    }
}
