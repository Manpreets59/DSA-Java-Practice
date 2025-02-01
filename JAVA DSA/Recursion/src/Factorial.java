public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
        System.out.println(digit(128));
        System.out.println(concept(5));
    }

    private static int fact(int n) {
        if(n<=1){
            return 1;
        }
    return n*fact(n-1);
    }

    // sum of n digit
    static int sum(int n ){
        if(n<=1){
            return 1;
        }
        return n + sum(n-1);
    }

    // Sum of digits of a number
    static int digit(int n){
        if(n<=1){
            return n;
        }
        int remainder = n%10;
        n = n/10;
        return remainder + digit(n);
    }

    // concept n-- and --n
    static int concept(int n){
        if(n==0){
            return n;
        }
        System.out.println(n);
        return concept(--n);
//        return concept(n--);
    }
}
