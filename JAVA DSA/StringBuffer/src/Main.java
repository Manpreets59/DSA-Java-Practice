// String Buffer Class: It is mutable sequence of character
// Advantages over string
// As it is mutable .The object new is not created after every change
// More efficient as new object is not created after every change it simply edits the current object
// Thread safe and it make it slow as it work on different processes whereas string builder is not thread safe
//  .

public class Main {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();

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
    }
}