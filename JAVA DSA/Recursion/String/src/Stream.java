public class Stream {
    public static void main(String[] args) {
//        skip("" , "aabaccda");
//        System.out.println(skip1("bccdah"));
        System.out.println(skipappnotApple("bacapplecdah"));
    }

    private static void skip(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));   // substring remove the first character and create new string
        }
        else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skip1(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip1(up.substring(1)); // Skip 'a'
        } else {
            return ch + skip1(up.substring(1)); // Append valid characters
        }
    }

    static String skipappnotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipappnotApple(up.substring(3)); // Skip 'a'
        } else {
            return up.charAt(0) + skipappnotApple(up.substring(1)); // Append valid characters
        }
    }
}
