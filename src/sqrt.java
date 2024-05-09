public class sqrt {
    static int sqrt(int n) {
        int value = 1;
        int i = 1;
        if (n == 0 || n == 1) {
            return n;
        }
        while (value <= n) {
            i++;
            value = i * i;

        }
        return i-1;
    }

    public static void main(String[] args) {
        int n=16;
        //int t=sqrt(n);
        System.out.println(sqrt(n));
        System.out.println(sqrt(83));
    }
}
