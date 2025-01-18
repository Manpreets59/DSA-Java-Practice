// It is a searching technique use to search an element
// To perform binary search we required data to arranged in sequence (in increasing order OR decreasing order)
// It is better than linear search Why??
// It required time complexity of O(log n)
// Space complexity is O(1)

// how it works? for array sorted in increasing order.
// it divides the array into half by calculating mid
// if mid == target return index of mid otherwise
// search an element in left if it is less than mid otherwise
// search an element in right if it is greater than mid
// otherwise return -1.

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,12,15,18,36,45,94,98};
        int target = 36;
        System.out.println(BSearch(arr,target));
    }

    // implementation of binary search
    static int BSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
