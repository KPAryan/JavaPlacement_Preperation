public class patterns {
    static void pattern1(int n){
        /*
        ******
        *****
        *****
        *****
        *****  */
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        /* *
           **
           ***
           ****
           ***** */
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        /* *****
           ****
           ***
           **
           *
        */
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n+1-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        /*
        1
        12
        123
        1234
         */
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        /*
         *
         **
         ***
         ****
         ***
         **
         *
         */
        for(int row=1;row<2*n;row++){
            int totalc=row>n ?2*n-row:row;
            for(int col=1;col<=totalc;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){

        for(int row=1;row<2*n;row++){
            int totalc=row>n ?2*n-row:row;
            int ns=n-totalc;
            for(int s=0;s<ns;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalc;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern22(int n){
        for(int row=1;row<=n;row++){
            for(int s=0;s<=n-row;s++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int row=1;row<=2*n-1;row++){
            int c=row>n ?2*n-row:row;
            for(int s=0;s<=n-c;s++){
                System.out.print("  ");
            }
            for(int col=c;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void patternn(int i){
        for(int row=1;row<=i;row++){
            for(int col=1;col<=i+1-row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(4);
        System.out.println("------------------------");
        pattern2(4);
        System.out.println("------------------------");
        pattern3(4);
        System.out.println("------------------------");
        pattern4(4);
        System.out.println("------------------------");
        pattern5(4);
        System.out.println("------------------------");
        pattern28(5);
        System.out.println("------------------------");
        pattern17(5);
        System.out.println("------------------------");
        pattern22(5);

        patternn(4);
    }
}
