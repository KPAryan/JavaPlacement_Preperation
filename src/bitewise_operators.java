

public class bitewise_operators {
    public static void main(String[] args) {
        int a=11;
        int b=12;
        System.out.println("A is: "+Integer.toBinaryString(a));
        System.out.println("B is: "+Integer.toBinaryString(b));
        //and
        int c=a&b;
        System.out.println("& of a,b is: "+Integer.toBinaryString(c));
        //or
        int d=a|b;
        System.out.println("| of a,b is: "+Integer.toBinaryString(d));
        //xor
        int e=a^b;
        System.out.println("xor of a,b is: "+Integer.toBinaryString(e));
        int f=c<<1;
        System.out.println(Integer.toBinaryString(f));
    }
}
