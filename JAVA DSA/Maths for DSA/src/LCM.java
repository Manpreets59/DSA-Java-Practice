// minimum number divisible by both a and b
// As number is divisible by both a and b then it should contain a *b = fd*gd = g*g*d
// here fd is hcf and gd is lcm
// hcf * lcm = a*b
// lcm = (a*b)/hcf.

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(10,9));
    }

    static int gcd(int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm (int a , int b){
        return a * b / gcd(a, b);
    }
}
