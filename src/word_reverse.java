public class word_reverse {
    public static void main(String[] args) {
        String s="a good  example";
        System.out.println(reverse(s));
    }
    static String reverse(String a){
        String[] s=a.split(" ");
        String result="";
        for(int i=s.length-1;i>=0;i--){
            result=result+s[i]+" ";

        }
        return result;
    }
}
