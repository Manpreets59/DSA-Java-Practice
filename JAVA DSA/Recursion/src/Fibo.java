public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibonachi(7));;
    }

     static int fibonachi(int n) {
        // Base Condition
         if(n<2){
             return n;
         }

        return fibonachi(n-1) + fibonachi(n-2);
    }
}
