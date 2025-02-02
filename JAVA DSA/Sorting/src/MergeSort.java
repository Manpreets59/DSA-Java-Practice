// divide the array recursively and then merge them back together it is divide and conquer algorithm
// example 8,3,4,12,5,6
//         {8,3,4} and {12,5,6} divide the array into half,
//         and it divides these array and then merge them back together
//         steps divide the array into two parts
//         get both parts sorted via recursion
//         merge the sorted parts .

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = {5,4,3,2,1 };
//        arr = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr = {5,4,3,2,1 };
        mergeSortinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<first.length && j<second.length){
            if(first[i] <second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the array is not complete
        // copy the remaining elements
        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergeSortinplace(int[] arr, int s, int e){
        if(e-s == 1){
            return;
        }
        int mid = (s+e)/2;

        mergeSortinplace(arr, s , mid);
        mergeSortinplace(arr, mid, e);

        mergeinplace(arr, s, mid, e);
    }

    private static void mergeinplace(int[] arr, int s, int m , int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j<e){
            if(arr[i] <arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the array is not complete
        // copy the remaining elements
        while(i< m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0 ; l< mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}


// time complexity :
//  O(nlogn).

