import java.util.*;
public class hashSetOpp {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(11);

        System.out.println(hs);
        hs.clear();
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
    }
}
