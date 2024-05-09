import java.util.*;
public class sume
{
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int even=0;
        int odd=0;
        while(a>0){
        int i=a%10;
        if(i%2==0){
            even=even+i;
        }
        else{
            odd=odd+i;
        }
        a=a/10;
        }
        sc.close();
        System.out.println(even+" "+odd);
    }
}
