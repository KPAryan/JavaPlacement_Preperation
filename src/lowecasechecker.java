import java.util.*;
public class lowecasechecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char a=sc.next().trim().charAt(0);
        System.out.println(a);
        if(a>='a' && a<='z'){
            System.out.println(a+" is a lowecase alphabet.");
        }
        else{
            System.out.println(a+" is a Upppercase alphabet");
        }
    }
}
