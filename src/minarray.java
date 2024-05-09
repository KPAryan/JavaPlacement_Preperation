public class minarray {
    public static void main(String[] args) {
        int[] a={12 ,5, 2, 10 ,8 ,15};
        mina(a);
        System.out.println();
    }
    public static  void mina(int[] arr){
        int r=arr[0];
        int m=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<r){
                r=arr[i];
            }
            if(arr[i]>m){
                m=arr[i];
            }
        }
        System.out.println(r+" "+m);


    }
}
