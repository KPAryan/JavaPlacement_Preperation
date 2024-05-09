import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        String s="a good  example";
        char[] a={'a',' ', 'g','o','o','d'};
        System.out.println(reverse(s));

        System.out.println(stringReverse(a));
  //      System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("epajfxzfnvte"));

    }
    static String reverse(String a){
        String result="";
        char c;
        for(int i=0;i<a.length();i++){
            c=a.charAt(i);
            result=c+result;
        }
        return result;
    }
    static int isPalindrome(String S) {
        String result="";
        char c;
        for(int i=0;i<S.length();i++){
            c=S.charAt(i);
            result=c+result;
        }
        if(S.matches(result)){
            return 1;
        }
        else
        return 0;
    }
    public static String stringReverse(char[] arr) {
        // Write your code here.
        String result=" ";
        String t=Arrays.toString(arr);
        char c;
        for(int i=0;i<arr.length;i++){
            c=arr[i];
            result=c+result;
        }
        return result;
    }
}
