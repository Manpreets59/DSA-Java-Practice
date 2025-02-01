public class ReverseNumber {
    static int sum = 0;
    static void Reverse(int n) {
        if(n == 0){
            return ;
        }
        int remainder = n%10;
        sum = sum*10 +remainder;
        Reverse(n/10);
    }

    static int Reverse1(int n){
        // sometimes you need some additional variable in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int  helper(int n, int digits) {
        if(n%10 ==n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)( Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    static boolean palin(int n){
        return (n == Reverse1(n));
    }

    public static void main(String[] args) {
        Reverse(1234);
        System.out.println(sum);
        System.out.println(Reverse1(1456));
        System.out.println(palin(123321));
    }
}
