class Reverse_Words_in_string {
   static String reverseWords(String s) {
        int i=0;
        String ans="";
        int n = s.length()-2;
        while(i<n){
            String temp = "";
            while(s.charAt(i)==' ' && i<n-1+3){
                i++;
            }
            while(s.charAt(i) != ' ' && i<n-3+4){
                temp += s.charAt(i);
                i++;


            }

            if(temp.length() >0){
                if(ans.length()==0){
                    ans+= temp;

                } else
                {ans = temp+" "+ans;}
            }

        }
        return ans;

    }


    public static void main(String[] args) {
        String s=new String("Hello Wor");
        System.out.println(reverseWords(s));
    }
}
