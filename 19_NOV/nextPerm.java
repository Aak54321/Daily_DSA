public class nextPerm {
    void nextPermutation(int[] arr) {
        // code here
        int index = -1;
        for(int i=arr.length - 2; i>=0;i--) {
            if(arr[i] >= arr[i+1]) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            reverse(arr,0,arr.length-1);
        }
        else {
            for(int i=arr.length-1;i>=0;i--) {
                if(arr[i] > arr[index]) {
                    swap(arr,i,index);
                    break;
                }
            }
            reverse(arr,index+1,arr.length-1);
            
        }
    }
    void reverse(int[] arr, int start, int end) {
        while(start<=end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}    

