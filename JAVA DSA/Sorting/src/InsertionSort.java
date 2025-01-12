// Insertion sort and its algorithm.
// https://www.geeksforgeeks.org/insertion-sort-algorithm/

// 5,3,4,1,2 in insertion we sort parts in this first we sort till index number 1 and then till index number 2 and then index number three and so on
// for every index put that index element at the correct index of LHS
// 3,5,4,1,2 after pass i = 0 then j = i+1 = 1 this is sorted which mean sort till index 1
// 3,4,5,1,2 after second pass i = 1 then j = i+1= 2 this will be sorted which mean sort till index 2
// 1,3,4,5,2 after third pass i =2  , j = 3 this will be sorted till index 3
// i will run from 0 to n-2 why?? => this is because of index out of bound error occur for j because it is j = i+1
// after every pass element will get sorted .
// when element j not smaller than j-1 then break the loop. Reason is because this is sorted

// complexity
// worst case : O(N^2)  / descending sorted
// number of comparison = 1 + 2 + 3 + 4 +...(n-1)  = O(N^2). these are number of comparison for worst case
// Best case : when array is already sorted = O(n).

// why use insertion sort ?
// Adaptive : Steps get reduce if array is sorted ex: if j is not smaller than j-1 break the loop , no of swaps as compared to bubble sort
//  It is stable sorting algorithm
//  It is used for smaller values of n , works good when array is partially sorted. This is the reason it takes part in hybrid sorting algorithm (As we use parts in merge sort)


import java.util.Arrays;

// Implementation of bubble sort
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap (int[] arr, int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
