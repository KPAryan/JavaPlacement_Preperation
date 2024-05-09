public class BulbSitcher {
    public static void main(String[] args) {
        System.out.println(bulbSwitch(4));
    }
    static int bulbSwitch(int n) {
       int on=n;
       for(int i=0;i<n;){
           on=n-i;
           i++;
       }
       return on;
    }
}
