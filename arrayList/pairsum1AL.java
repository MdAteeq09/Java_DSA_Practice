import java.util.ArrayList;

public class pairsum1AL {
    public static Boolean pairsum1( ArrayList<Integer> List, int target) { // brute force O(n^2)
        for(int i=0; i<List.size(); i++) {
            for(int j=i+1; j<List.size(); j++) {
                if(List.get(i) + List.get(j)== target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairsum(ArrayList<Integer> List, int target) { // 2 pointer approach 
        int lp = 0;
        int rp = List.size()-1;

        while (lp < rp) {
            //case 1
            if (List.get(lp)+List.get(rp) == target) {
                return true;
            }

            //case 2
            if(List.get(lp)+List.get(rp) < target) {
                lp++;
            } else {
                //case 3
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        int target = 5;

        System.out.println(pairsum(List, target));
    }
}
    

