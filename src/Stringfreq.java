public class Stringfreq {
    public static void main(String[] args) {
       String s="xxyyyz";
        System.out.println(sameFreq(s));
    }
    static boolean sameFreq(String s) {
        // code here
        boolean ans=false;
        int count=0;
        for(int i=0;i<s.length()-1;i++){
             if(s.charAt(i)==s.charAt(i+1)){
                 count++;
             }

        }
        if(count==1){
            ans=true;
        }
        return ans;
    }
}
