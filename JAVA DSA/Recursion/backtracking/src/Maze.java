// Maze problem : It includes a number of way of reaching a specific index from a given index

public class Maze {
    public static void main(String[] args) {

    }

    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r, c-1);
        return left+right;
    }
}
