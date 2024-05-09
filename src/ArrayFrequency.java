public class ArrayFrequency {
    static void freq(int []a){
        int count=1;
        int i=1;
        while(i< a.length){
            while(i<a.length && a[i]==a[i-1]){
                count++;
                i++;
            }
            System.out.println(a[i-1]+" "+count);
            count=1;
            i++;

        }
        if(a.length==1 || a[i-1]!=a[i-2]){
            System.out.println(a[i-1]+" "+count);
        }
    }

    public static void main(String[] args) {
        int [] arr={20,20,30,30,30,40,50,50,60};
        freq(arr);
    }
}
