import java.util.Arrays;

public class isogramstring {
    static boolean isIsogram(String s){
        s.toLowerCase();
        char [] a=s.toCharArray();
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Gekuuu"));
    }
}
