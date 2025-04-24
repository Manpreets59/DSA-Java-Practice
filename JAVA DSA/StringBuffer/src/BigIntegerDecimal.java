// Storing large integer
// BigInteger object class inside it, we have (java.lang.number) and inside it, we have (java.math.BigInteger)
// internally it extends the number class, and it implements comparatable interface (BigInteger)
// range of this is -2^Integer.MAX_value to 2^Integer.MAX_value both exclusive and as it is class it throw null pointer exception
// .

import java.math.BigInteger;
import java.math.BigDecimal;

public class BigIntegerDecimal {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(544456753);
        int C = B.intValue(); // Convert BI to int
        BigInteger c = new BigInteger("234567822575773438354");
        BigInteger x = new BigInteger("234567822575773438354");


        // constants
        BigInteger D = BigInteger.ZERO;

        // Addition
        BigInteger s = A.add(B);
        BigInteger d = c.divide(x);
        System.out.println(s);
        System.out.println(d);
        System.out.println(c);
        System.out.println(factorial.fact(5000));
    }

    static void BD(){
        double x = 0.03;
        double y = 0.04;
//        double ans = y-x;
//        System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal Ans =  Y.subtract(X);
        System.out.println(Ans);
    }
    // operation addition , multiplication, etc ....
}

// Why include some integer at end BigInteger
// float and double are floating point numbers binary representation of a fraction and a power exponent
// i.e why they give some error (10^-19)
// but big decimal give exact answer

// range : It contains a random precision integer unscaled value and a 32 bit integer scale
// scale : no of digit right of decimal point
// else : unscale value = 10^-scale.

