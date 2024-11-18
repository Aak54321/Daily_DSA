public class QuickSort {
     static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);    
        }
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int pivot = arr[high];
        int left = low;
        for(int i = low;i<=high-1;i++) {
            if(arr[i] < pivot) {
                swap(arr,i,left);
                left++;
            }
        }
        swap(arr,left,high);
        
        return left;
    }
    static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
