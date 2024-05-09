public class Sorting {
    public static void main(String[] args) {
        int[] a={7,1,5,4,2};
        //bubble sort
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                //swap
                if(a[j]>a[j+1]){
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            for(int k=0;k<a.length;k++){
                System.out.print(a[k]+", ");
            }
        }
    }

}
