
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
// ans xor (o to a-1) this is done to remove the extra steps .

public class RangeXor {
    public static void main(String[] args) {
        // Range xor for a, b= xor(b) ^(a-1)
        int a = 3;
        int b = 9;
        int ans = xor(b)^xor(a-1);
        System.out.println(ans);

        // only for check, will time limit exceed for large numbers
        int ans2 = 0;
        for(int i =a ; i<=b ; i++){
            ans2 = i;
        }
        System.out.println(ans2);
    }

    // this give xor from o to a
    static int xor(int a){
        if(a%4 == 0){
            return a ;
        }
        if(a%4 == 1){
            return 1 ;
        }
        if(a%4 == 2){
            return a+1 ;
        }
        return 0 ;
    }
}
