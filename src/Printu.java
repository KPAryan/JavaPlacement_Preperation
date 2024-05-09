public class Printu {
    public static void main(String[] args) {
        printx(5);
        //System.out.println();;
    }
    public static void printx(int n ){
        if(n==0){
            return;
        }
        printx(n-1);
        System.out.println(n);
}
}
