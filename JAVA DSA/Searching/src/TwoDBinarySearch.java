public class TwoDBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        searchMatrix(matrix, target);
    }

    static boolean searchMatrix(int[][] matrix, int target){
        // Check for edge case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;

        // Perform binary search to find the row where the target might exist
        int rStart = 0;
        int rEnd = col-1;
        int targetRow = -1;

        while(rStart<= rEnd){
            int midRow = rStart + (rEnd-rStart)/2;

            if(target >= matrix[midRow][0] && target <= matrix[midRow][col-1] ){
                targetRow = midRow;
                break;
            }else if (target <matrix[midRow][0]){
                rEnd = midRow-1;
            }
            else{
                rStart = midRow +1;
            }
        }

        // if now row was found return false
        if (targetRow ==-1){
            return false;
        }

        // perform binary search on the identified row
         return binarySearch (matrix[targetRow],target, rStart, rEnd)!=-1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
