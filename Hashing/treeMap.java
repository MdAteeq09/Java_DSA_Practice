import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("Japan", 150);
        tm.put("India", 100);
        tm.put("UAE", 200);
        tm.put("China", 250);

        System.out.println(tm);
    }
}
