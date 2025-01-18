
// It is a searching technique use to search an element
// It starts from first element and check for each element
// if element is equal to target return the index of element
// otherwise return -1

// Time complexity of linear search is O(n) where n is equal to number of elements
// The space complexity of linear search is O(1). This is because the amount of extra data in linear search is fixed

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 16, 18, 22, 13, 65};
        int target = 18;
        System.out.println(Search(arr, target));
    }

    // program to implement linear search
    static int Search(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
