// Rotated Binary Search
// we have cases
// 1) if arr[start] <= arr[mid]
// if key>= arr[start]<= arr[mid]
//  else s= mid+1
// 2) if key>= arr[mid]  && <= arr[end]
// s = mid +1
// 3) else
//    end = mid -1.

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr, 1, 0, arr.length-1));
    }

    static int search(int[] arr, int target , int s ,int e){
        if(s>e){
            return -1;
        }

        int m = s+( e-s/2);
        if(arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){
            if(target>= arr[s] && target <= arr[m]){
               return search(arr, target, s, m-1);
            }
            else{
                return search(arr, target, m+1, e);
            }
        }
        if(target >= arr[m] && target<= arr[e]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }
}
