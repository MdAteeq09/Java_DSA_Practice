import java.util.*;
public class pairsum2AL {

    public static boolean pairsum2( ArrayList<Integer> List, int target) {
        int bp = 0;
        int n = List.size();

        for(int i=0; i<List.size(); i++) {
            if(List.get(i) > List.get(i+1)) { // breaking 
                bp = i;
                break;
            }
        }

        int lp = bp+1; //smallest
        int rp = bp; //largest

        while (lp != rp) {
            //case 1
            if(List.get(lp) + List.get(rp) == target) {
                return true;
            }

            //case 2
            if (List.get(lp) + List.get(rp) <  target) {
                lp = (lp+1) % n;
            } else {
                rp = (n + rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList();

        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);

        int target = 100;

        System.out.println(pairsum2(List, target));
    }
}