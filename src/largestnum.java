import java.util.*;
public class largestnum {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a,b,c;
        System.out.println("Enter the First num:");
        a=sc.nextInt();
        System.out.println("Enter the Second num:");
        b=sc.nextInt();
        System.out.println("Enter the Third num:");
        c=sc.nextInt();
        int com=a;
        if(b>com){
            System.out.println(b);
        }
        if(c>com){
            System.out.println(c);
        }
        if(com==b && com==c){
            System.out.println("All are equal");
        }
    }
}
