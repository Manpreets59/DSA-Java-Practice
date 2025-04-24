// Storing large integer
// BigInteger object class inside it, we have (java.lang.number) and inside it, we have (java.math.BigInteger)
// internally it extends the number class, and it implements comparatable interface (BigInteger)
// range of this is -2^Integer.MAX_value to 2^Integer.MAX_value both exclusive and as it is class it throw null pointer exception
// .

import java.math.BigInteger;

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
    }
}

