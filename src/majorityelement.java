public class majorityelement {
    static int mjelement(int [] arr){
        for(int i=0;i< arr.length;i++){
            int count=1;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
    //optimized
    static int majoElement(int [] arr){
        int major=arr[0];
        int count=1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==major){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                major=arr[i];
                count=1;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int [] arr={8,5,8,1,2,8,8};
        System.out.println(mjelement(arr));
        System.out.println(majoElement(arr));
    }
}
