public class stringsubsequence {
    static void printsubSeq(String a,String ans,int index){
        if(index>=a.length()){
            System.out.println(ans);
            return;
        }
        //exclude
        printsubSeq(a,ans,index+1);
        //include
        ans=ans+a.charAt(index);
        printsubSeq(a,ans,index+1);
    }

    public static void main(String[] args) {

    }
}
