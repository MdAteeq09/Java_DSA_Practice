import java.util.*;

public class linkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 10);
        lhm.put("Japan", 150);
        lhm.put("USA", 200);
        lhm.put("China", 250);

        System.out.println(lhm);
    }
}