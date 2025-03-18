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
                {true, false, true},
                {true, true, true}
        };
        pathRestriction("", board, 0,0);
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
}
