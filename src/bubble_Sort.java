import java.util.Arrays;

public class bubble_Sort {

    public static void main(String[] args) {
        int arr[]={3,2,1,4,5};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean todo=false;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                //swap
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    todo=true;
                }
                if(!todo){
                    break;
                }
            }
        }
    }
}
