// given number n and find the no of set bits in it
// for n = 9 = 1001
// ans = 2 number of set bits
// .

public class SetBits {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBit(n));
    }
    private static int setBit(int n){
        int count = 0;
//        while(n>0){
//            count++;
//            n-=(n&-n);
//        }
        while(n>0){
            count++;
            n= n & (n-1);
        }

        return count;
    }
}

// find xor of number from o to a
// if a = 0 then xor from 0 to a = 0
// if a = 1 then xor = 1
//  a = 2  xor = 3
//  a=3 xor = 0
//  a = 4 xor = 4
//  according to this pattern
//  if a%4 = a
//  a%4 = 1 then ans = 1
//  a%4 = 2 then ans = a+1
//  a%4 = 3 then ans = 0.

// xor of all no between a and b
// xor from o to a is extra and we xor it again with result and it get canceled
// ans = f(b) which is xor form o to b
// ans xor (o to a-1).