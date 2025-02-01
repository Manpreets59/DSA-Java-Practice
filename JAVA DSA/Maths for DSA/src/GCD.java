// Euclidean Algorithm: gcd (a,b) = gcd(rem(b,a),a)
// gcd(105,224) : gcd(rem(224,105),)
// why is it working?
// 105x+ 224y because the gcd of (105,224) also divide a linear combination of 105 & 224.

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
    }

    static int gcd (int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}
