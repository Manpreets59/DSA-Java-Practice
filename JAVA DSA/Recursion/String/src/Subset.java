// Permutation and combination
// subset-> non-adjacent collection
// Recursion and iteration
// This pattern of Taking some elements and removing some is know as subset pattern  .

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
//        subseq("" , "abc");
//        System.out.println(subseqRet("" , "abc"));
//        subseqAscii("", "abc");
        System.out.println(subseqAsciiReturn("", "abc"));
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.print(" "+p + " ");
            return;
        }
        char ch = up.charAt(0);

        // now make two call for the String abc
        // in which you can add the first character of unprocessed in processed and ignore the first character of unprocessed .
        subseq(p, up.substring(1));
        subseq(p+ch, up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> right= subseqRet(p+ch, up.substring(1));
        ArrayList<String> left = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.print(" "+p + " ");
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
        subseq(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subseqAsciiReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subseqAsciiReturn(p+ch, up.substring(1));
        ArrayList<String> second = subseqAsciiReturn(p, up.substring(1));
        ArrayList<String> third = subseqAsciiReturn(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}


