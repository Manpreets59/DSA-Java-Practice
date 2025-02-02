public class CheckArrayLinear {
    public static void main(String[] args) {
        int[] arr = {12,15,120,17,19};
        int index = 1;
        System.out.println(sorted(arr, index ));
    }

    static boolean sorted(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }
        return (arr[index]<=arr[index+1]) && sorted(arr, index+1);
    }
}
