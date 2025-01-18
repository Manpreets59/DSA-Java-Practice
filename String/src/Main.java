// What is String?
// collection of characters.

// Internal working of strings
// String name = "manpreet"
//strings objects are immutable but when we change object of string it create new object and our reference variable point to that object and garbage collector automatically delete it .
// String is a class u can check its implementation using command + ctrl
// Every string that you create is an object of type string in above example name is reference variable, manpreet is an object, String is data type.

// this link provide the idea about internal working of string, and also it covers some interview questions
// https://blog.devops.dev/java-internals-string-c3721ed91e6d

// this link provide the idea about string comparison in java
// https://www.javatpoint.com/string-comparison-in-java
//  == method, as well as .equals method.

// how to create different of same value
// string a = new string ("manpreet")
// string b = new string ("manpreet")
// in this example we create different object with same value and outside the pool but inside the heap
// in this case when we only need to check value then use .equals method

public class Main {
    public static void main(String[] args) {
        String a = "Manpreet";
        String b = "Manpreet";
        System.out.println(a);
        System.out.println(a==b); // example of == method

        // different object with same value
        String name1 = new String("manpreet");
        String name2 = new String("manpreet");
        System.out.println(name1 == name2);  // this give false because we have different object with same value
        System.out.println(name1.equals(name2));// example of .equals method
        System.out.println(name1.charAt(0));
    }
}