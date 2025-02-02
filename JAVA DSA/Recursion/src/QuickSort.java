// we can take pivot which can be any number of our array
// after first pass all the element less than pivot will be at left and all element greater than pivot will be at the right of pivot
// after every pass the pivot element is at its correct position
// 5,4,3,2,1
// lets 4 is pivot after first pass [3,2,1],4,[5]
// lets 3 as pivot [1,2],3,[4,5]
// sort the rest element using recursion
// How to put pivot at correct position?
// we use two pointer and swap element so that element less than pivot should be on left and element greater than pivot on right
// how to pick pivot
// random element , corner element , middle element
// recurrence relation of quick sort is   T(N) = T(K) + T(N-K-1) + O(N)
// Worst element When largest element is the pivot hence k = 0 mean recurrence space decrease very less
// and for worst case recurrence relation is T(N) = T(0) + T(N-1) + O(N) = T(N-1) + O(N) = O(N^2)
// best case is when the pivot element is middle element T(N) = T(N/2) + T(N/2) + O(N) = 2T(N/2) + O(N) = O(NlogN)
// Not Stable
// In-place sorting algorithm O(N) extra space because it does not create any extra array as merge sort
// merge is better in linked list due to memory allocation not continuous
// Hybrid sorting algorithm Arrays.sort(arr) use quick sort, insertion sort
// internal sorting algorithm use these because they provide internal sorting algorithm they have collection framework.


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums, int low , int high){
        if(low>= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s+ (e-s)/2;
        int pivot = nums[m];

        while(s <= e){
            // also a reason why if its already sorted it will not swap
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct position, please sort two halves
        sort(nums, low, e);
        sort(nums,s,high);
    }
}
