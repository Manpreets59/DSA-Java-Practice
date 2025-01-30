// XOR the array to get solution
// as all the number which have duplicate in the array will become zero according to this property (A xor A = 0)
// only thing remaining in the end is unique number .

public class Findunique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for(int n:arr){
            unique ^= n;
        }
        return unique;
    }
}
