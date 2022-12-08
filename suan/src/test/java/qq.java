public class qq {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int target=15;
        int i = binarySearch(arr, target);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int target) {
        int l =0;int h=arr.length-1;
        while (l<h){
            int m=(l+h)/2;
            if (arr[m]==target){
                return m;
            }else if (arr[m]>target){
                l=m-1;

            }else {
                l=m+1;
            }
        }return -1;
    }
}
