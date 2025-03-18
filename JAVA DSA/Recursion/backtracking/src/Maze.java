// Maze problem : It includes a number of way of reaching a specific index from a given index

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("" , 3, 3);
//        System.out.println(pathRet("", 3,3));
//        System.out.println(pathRetDiagonal("" , 3 , 3));
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        pathRestriction("", board, 0,0);
//        allPath("", board, 0,0);
    }

    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r, c-1);
        return left+right;
    }


    // This is overview how it goes down and Right to reach target
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p + 'D' , r-1 , c);
        }
        if(c>1){
            path(p+'R' , r , c-1 );
        }
    }


    // Returning the path in the ArrayList
    static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(p + 'D' , r-1 , c));
        }
        if(c>1){
            list.addAll(pathRet(p+'R' , r , c-1 ));
        }
        return list ;
    }

//adding new condition for going diagonal to reach target
    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathRetDiagonal(p + 'D' , r-1 , c-1));
        }
        if(r>1){
            list.addAll(pathRetDiagonal(p + 'V' , r-1 , c));
        }
        if(c>1){
            list.addAll(pathRetDiagonal(p+'H' , r , c-1 ));
        }
        return list ;
    }

    // with a restriction in path
    static void pathRestriction(String p,boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            pathRestriction(p + 'D' ,maze, r+1 , c);
        }
        if(c<maze[0].length-1){
            pathRestriction(p+'R' ,maze, r , c+1 );
        }
    }


    //moving in all direction up, down, left, right
    //This is an example of endless recursion where we get into same position from where we started
    // Solution all cells that are visited mark those as false so that we don't get there
    // Marking false mean I have that cell in my current path so when that path is over you are in another recursion
    // call these cells should not be false .while when you go back (return) you make these false as true. When you come out of the
    // recursive function you can make changes mark it as true.
    static void allPath1(String p,boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            allPath1(p + 'D' ,maze, r+1 , c);
        }
        if(c<maze[0].length-1){
            allPath1(p+'R' ,maze, r , c+1 );
        }
        if(r>0){
            allPath1(p+'U' ,maze, r-1 , c );
        }
        if(c>0){
            allPath1(p+'R' ,maze, r , c-1 );
        }
    }
    //what is backtracking ?
    // when you come out of recursive function and you are now in above recursive call hence remark the cell as true is know as
    // backtracking in simple it is what would be my array if i have not taken this path .

    static void allPath(String p,boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        //I am considering this block in my path as false
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPath(p + 'R', maze, r, c - 1);
        }

        // This line is where the function will be over so before the function get removed also removed the changes
        // that were made by that function
        maze[r][c] = true;
    }
}
