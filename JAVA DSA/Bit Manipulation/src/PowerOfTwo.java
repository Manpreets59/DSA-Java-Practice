// q Pascals triangle
// sum of each row = nC0 + nC1+ .... +nCn = 2^n
// for nth row sum = 2^(n-1)
// answer is 1<<(n-1) = 1*2^n
// q you are given a number find out if its power of two or not
// 10000 in binary is power of 2 so if there are two 1 in a number then it is not a power of two for example 1010
// first way we can do right shift till number is greater than 0 if we encounter 1 then increment counter in end if counter!=1 then return not a power of two
// second way if (n&(n-1)) == 0 then it is power of two.

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16; //fix for n =0
        if(n == 0){
            System.out.println(false);;
        }
        else {
            boolean ans = (n & (n - 1)) == 0;
            System.out.println(ans);
        }
    }
}
