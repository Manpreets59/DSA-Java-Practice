import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
    }
    static void dice (String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=6 && i <= target ;i++){
            dice(p+i, target-i);
        }
    }

    //return using arraylist
    static ArrayList<String> diceRet (String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i<=6 && i <= target ;i++){
            ans.addAll(diceRet(p+i, target-i));
        }
        return ans;
    }

    static ArrayList<String> diceFacdRet (String p, int target , int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i<=face && i <= target ;i++){
            ans.addAll(diceFacdRet(p+i, target-i, face));
        }
        return ans;
    }

    static void diceFaces (String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=face && i <= target ;i++){
            diceFaces(p+i, target-i , face);
        }
    }
}
