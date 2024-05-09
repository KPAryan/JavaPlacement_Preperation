public class TrapingRainWater {
    public static void main(String[] args) {
        int[] arr = {3,0,0,2,0,4};
        System.out.println(trappingWater(arr,6));
    }
    //brutforce
    static long trappingWater(int arr[], int n) {
        // Your code here
        int[] left=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(left[i+1],arr[i]);
        }
        long result=0;
        for(int i=0;i<n;i++){
            result+=(Math.min(left[i],right[i]))-arr[i];
        }
        return result;
    }
}
