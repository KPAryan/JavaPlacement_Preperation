public class BitManipulation {
    public static void main(String[] args) {
        //get 3rd bit of 11
        int a=11;
        System.out.println(Integer.toBinaryString(a));
        int bitmask=1<<3;
        if((bitmask & a)==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("One");
        }
        //set bit
        int result= (1<<2) | a;
        System.out.println(result);
        //clear bit
        int ans=(1<<2) & (~bitmask);
        System.out.println(Integer.toBinaryString(ans));
    }
}
