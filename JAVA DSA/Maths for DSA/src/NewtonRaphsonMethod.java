// used to determine square root
// complexity = O((log n) f(n))
// here f(n) is the complexity of calculating f(x)/f'(x).

// root = (x+ n/x)/2
// Assign x to n
// error = root-x you will find ans when error x<1
// update the value of x = root .

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
             root = 0.5*(x+(n/x));

            if (Math.abs(root - x)<1) {
                break;
            }

            x = root;
        }
        return root;
    }
}
