public class SB {
    public static void main(String[] args) {
        StringBuffer builder = new StringBuffer();
        for(int i =0; i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
// It does not create new object it simply add value to builder, and it also contains various inbuilt functions