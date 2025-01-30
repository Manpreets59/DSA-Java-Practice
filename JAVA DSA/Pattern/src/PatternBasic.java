// Steps to solve pattern problems
// step1: Run the outer loop = no of lines = no of rows
// step2: Identify the no of rows for each column which is simply determine the relationship between them
// step3: What do you need to print .

public class PatternBasic {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern5(5);
    }

     static void pattern3(int n) {
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for(int i =0 ;i<2*n ;i++){
            int totalcols = i>n? 2*n-i:i;
            for(int j=0;j<totalcols;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
