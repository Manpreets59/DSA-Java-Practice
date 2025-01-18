import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
//        this is an example of ascii addition of characters
        System.out.println('a'+'b');
//      Addition of two string
        System.out.println("a"+"b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
//      if we add string + integer then it give this
        System.out.println("a" +1); // this is same after few steps: "a"+"1" and integer will be converted to Integer that will call toString()
        System.out.println("manpreet" + new ArrayList<>());
        System.out.println("manpreet "+new Integer(56));

        // the operator + in java is applicable for primitive and any one of the value is string and is not applicable for arraylist and integer
        // at least one string is required and there is operator like -
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
