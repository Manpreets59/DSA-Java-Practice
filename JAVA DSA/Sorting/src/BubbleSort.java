// It is a sorting technique use to arrange element either in increasing or decreasing order
// It is also known as sinking sort, exchange sort
// It compare the element with next element if element is greater than the next element then swap
// In bubble sort intuition is with every pass largest element is at the end
// example 3,1,4,5,2   at first pass compare element with next using loop
//         1,3,4,5,2
//         1,3,4,5,2
//         1,3,4,2,5   after first pass the largest element is at the end
//         second pass
//         1,3,4,2,5.
//         1,3,4,2,5
//         1,3,2,4,5. at second pass the second-largest element is at second last position
//         third pass
//         1,2,3,4,5.

// with every pass the largest element is at its correct position so we don't need to compare it and we can ignore it
// so loop runs from i = 0 , j= 1
// In this loop we compare j with j-1 which is internal loop
// and i is external loop we can say it as counter, and it is for no of pass
// so internal loop runs from j=1 to j-i-1 and in this -i is used to skip element which are at correct position

// complexity for bubble sort
// space complexity O(1) constant , no extra space required i.e copying the array etc. not required which mean inplace sorting algorithm
// time complexity best case O(n)
// worst case O(n^2)
// total comparison = (n-1)+(n-2)+(n-3)+..
//                     4n-(1+2+3+..)
//                     4n-(n*(n+1))/2 = (8n-n^2-n)/2  = O((7n-n^2)/2) = O(n^2) which is complexity.
// where n is the number of comparison

// It is stable sorting algorithm when original order is maintained then it is called sorting algorithm
// when original order is not maintained then it is called unstable sorting algorithm


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,15,31,22,10,85};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    // implementation of bubble sort
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0; i<arr.length;i++){
            swapped = false;
            // for each step, max item will come at the last respective index
            for(int j=1;j <= arr.length-i-1;j++){
                // swap if item is smaller than previous item
                if (arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}
