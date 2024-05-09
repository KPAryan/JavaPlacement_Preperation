public class subsesum {

    static int sumsubset(int[] a,int sum,int i){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(i== a.length){
            return 0;
        }
        return sumsubset(a,sum-a[i],i+1)+ sumsubset(a,sum,i+1);
    }
    public static void main(String[] args) {
        int[] arr={10,20,15,40};
        System.out.println(sumsubset(arr,25,0));

    }
}
