// String Buffer Class: It is mutable sequence of character
// Advantages over string
// As it is mutable .The object new is not created after every change
// More efficient as new object is not created after every change it simply edits the current object
// Thread safe and it make it slow as it work on different processes whereas string builder is not thread safe
//  .

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        // constructor 2
        StringBuffer sb2 = new StringBuffer("Manpreet ");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);

        // Methods
        sb.append("Hlo String Buffer");
        sb.append("is nice");
        sb.insert(2, " name ");
        sb.replace(0,2,"good");
        sb.delete(5,9);
        sb.reverse();

        String str = sb.toString();
        System.out.println(str);

//        Random random = new Random();
//        System.out.println(random.nextFloat());
//
//        System.out.println((char) (97));
        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        // Remove white spaces
        String sentence = "H A R M O L";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\S", ""));

        //split
        String arr = "man van kan ";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        //Rounding off
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(7.2));
    }
}