import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
//        List<List<Integer>> ans = subset(arr);
//        for(List<Integer> list: ans){
//            System.out.println(list);
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for(int i = 0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }


// Creating subset using iterative approach
// Time Complexity O(N * 2^N ) here 2^N is number of subset
// And we are creating new subset from original one so it take N complexity so overall complexity is O(N * 2^N)

// Space complexity is O(2^N * N) total subset and ever subset take N space so overall complexity is O(2^N * N) .




// In case of duplicate element when you find duplicate element, then only add it in the newly created subset of previous step
// because of above point duplicate have to be together for this sort the array so that duplicate should be together


    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i <arr.length; i++){
            start = 0;
            // if current element and previous element is same , s = e+1
            if(i>0 && arr[i] == arr[i-1]){
                start = end +1 ;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int j = start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}