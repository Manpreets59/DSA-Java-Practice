// Number of permutation if we have N character in string is N!
// No of recursive calls at each level is given by size of processed +1

public class Permutation {
    public static void main(String[] args) {
        permutations("", "abc");
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0; i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f+ch+s , up.substring(1));
        }
    }
}
