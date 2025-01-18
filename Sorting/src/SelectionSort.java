// what is selection sort ?
// you are going to select an element and put it at its correct position
// example I have an arr, and I'm gone sort it
// 4,5,1,2,3
// select largest element and put at its correct index if they are arrange in ascending order the correct position is last index
//  so it became 4,3,1,2,5
//  and now five is at its correct index now sort the remaining array and find the maxitem in this and put it at second last index and repeat till all element are not sorted
//  now it became 2,3,1,4,5,
//  2,1,3,4,5
//  1,2,3,4,5
//  Time complexity
//  total comparison = (n-1)+(n-2)+...0
//                     0+1+....(n-1)
//                     sum of n number = n(n+1)/2 = O(n^2)
//  worst case = O(n^2)
//  Best case = O(n^2)
//  It is not stable
//  It perform well on small lists/array.

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Implementation of selection sort
    static void selection(int[] arr){
        for (int i=0;i<arr.length;i++){
            // Find the max item in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=start; i<=end ; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap (int[] arr, int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
