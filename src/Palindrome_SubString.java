public class Palindrome_SubString {
    public static void main(String[] args) {
        String a = "abaab";
        System.out.println(CountPS(a, 5));
    }

    static int CountPS(String S, int N) {
        //code here
        int i =0;
        int counter =0 ;
        while(i<N-1){

            int k = i+1 ;
            while(k <= N){


                if(S.substring(i,k).length() > 1){
                    if(isPalindrome(S.substring(i,k))){
                        ++ counter;

                    }
                }
                else if(k == N){
                    if(S.substring(i).length() > 1){
                        if(isPalindrome(S.substring(i,k))){
                            ++ counter;

                        }
                    }
                }

                k++;
            }
            i++;
        }
        return counter;
    }
    static boolean isPalindrome(String S)
    {

        int n = S.length();

        int i =0;
        while(i < n/2){
            if(S.charAt(i) != S.charAt(n-i-1)){
                return false;
            }
            i++;
        }
        return true;
    }
}