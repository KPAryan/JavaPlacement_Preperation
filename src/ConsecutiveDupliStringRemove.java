public class ConsecutiveDupliStringRemove {
    static String dupliStringRemove(String a){
        String ans="";
        int n=a.length();
        for(int i=0;i<n;i++){
            if(i<n-1 && a.charAt(i)==a.charAt(i+1)){
                continue;
            }
            ans+=a.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(dupliStringRemove("aabbbcc"));
    }
}
