public class LinearSearch {
    static  int mylinearsearch(int[] arr, int value) {
        int l = arr.length;
        int f=-1;
        for (int i = 0; i < l; i++) {
            int element = arr[i];
            if (element == value) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2,4, 6, 7};
        int v1 = 4;
        int v2 = 3;
        int r1 = mylinearsearch(a, v1);
        int r2 = mylinearsearch(a, v2);
        System.out.println(r1);
        System.out.println(r2);
    }
}
