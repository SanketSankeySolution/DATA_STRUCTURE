import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[]={5,4,3,1,2};
        slsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void slsort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=Max(arr,0,last);
           swap(arr,maxIndex,last);
        }
    }

    private static int Max(int[] arr, int start, int last) {
        int max=start;

        for(int i=0;i<= last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    private static void swap(int[]arr, int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
