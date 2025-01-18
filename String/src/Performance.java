public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i =0; i<26;i++){
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);
    }
}

// In the above example it create different object after evey iteration as we know string are inside pool and they are immutable
// so we need a new data type to which we can directly add an element and it doesn't create different object so we use STRING BUILDER
