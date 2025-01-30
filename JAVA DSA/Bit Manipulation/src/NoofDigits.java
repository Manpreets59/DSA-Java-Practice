// find Number of digits in base b
// formula no of digits in base b of number n = int (log n base b) +1
// this formula provide the value of no of digits in binary representation .

public class NoofDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;

        int ans = (int)(Math.log(n)/Math.log(b)) + 1;
        System.out.println(ans);
    }
}

// q Pascals triangle
// sum of each row = nC0 + nC1+ .... +nCn = 2^n
// for nth row sum = 2^(n-1)
// answer is 1<<(n-1) = 1*2^n
// q you are given a number find out if its power of two or not
// 10000 in binary is power of 2 so if there are two 1 in a number then it is not a power of two for example 1010
// first way we can do right shift till number is greater than 0 if we encounter 1 then increment counter in end if counter!=1 then return not a power of two
// second way if (n&(n-1)) == 0 then it is power of two.