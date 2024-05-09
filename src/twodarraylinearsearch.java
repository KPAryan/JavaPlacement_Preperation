public class twodarraylinearsearch {
    public static void main(String[] args) {
        int[][] a={
            {1,5,7},
            {2,8,6},
            {3,9,11},
        };
        int target=11;
        int r1=search(a,target);
        System.out.println(r1);
    }
    static int search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return 1;
                }
            }
        }
        return 0;
    }
}
