// if we have duplicate we can use array list to get their index
// and also we can perform linear search from back using index -1

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 12,16,18,15,18,78};
        int target = 15;
        System.out.println(Search2(arr, target, 0));
        System.out.println(Search3(arr, 18, 0, new ArrayList<>()));
        System.out.println(Search4(arr, 18, 0));
    }

    static boolean Search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index] == target) ||  Search(arr, target, index+1);
    }

    static int Search2(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        else if(arr[index] == target){
            return index;
        }
        else {
            return Search2(arr, target, index + 1);
        }
    }

    static ArrayList<Integer> Search3(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        else if(arr[index] == target){
            list.add(index);
        }

        return Search3(arr, target, index + 1, list);

    }


// if you want to add list directly in the function body then it would create different list for each call and the bellow is the
// below is the implementation for this .

    static ArrayList<Integer> Search4(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        } else if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = Search4(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}