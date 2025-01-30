// use the concept of bit manipulation to determine number is even or odd

public class OddEven {
    public static void main(String[] args) {
        int n = 67;
        if((n & 1) == 1){
            System.out.println("odd number");
        }else{
            System.out.println("Even number");
        }
    }
}
