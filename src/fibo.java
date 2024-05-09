import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*int n;
        System.out.println("Enter the number upto which you want the fibonnaci series: ");
        n=sc.nextInt();
        int a=0;
        int b=1;
        int co=2;
        while(co<=n){
            int temp=b;
            b=b+a;
            a=temp;
            co++;
        }
        System.out.println(b);*/
        char c=sc.next().charAt(0);
        if(c=='a' && c=='z'){
            System.out.println(0);
        }
        else if(c=='A' && c=='Z'){
            System.out.println(1);
        }
        else{
            System.out.println(1);
        }
        int chat = 0;
        switch (chat){
            
        }
        
    }
}


