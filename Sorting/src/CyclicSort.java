// Cyclic Sort
// When given number from range 1 to n use cyclic sort

// 3,5,2,1,4
// 1,2,3,4,5  After sorting the array become this and its index after sorting is index = value-1

//  Algorithm of cyclic sort with an example ?
//now check for the first element, check if it is at its correct index then increment index otherwise if not at correct index then swap with its correct index
// 3,5,2,1,4
// 2,5,3,1,4
// 5,2,3,1,4
// 4,2,3,1,5
// 1,2,3,4,5
// time complexity of this example is 4 swaps + 5 swaps for each  = 9 swap
// and in general for n variable  in worst case it is => (N-1) + N  = (2N-1) => O(N) .

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Implementation for Cyclic Sort
    static void Cyclic (int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i , correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap (int[] arr, int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
