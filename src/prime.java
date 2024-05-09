import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int fla = 0;
        a=sc.nextInt();
        for(int c=2;c<a;c++){
            if(a%c==0){
                //System.out.println("Not a prime");
                fla=1;
                break;
            }
            else{
                fla=0;
            }
        }
        System.out.println(fla);
        if(fla==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a prime");
        }

    }

}
