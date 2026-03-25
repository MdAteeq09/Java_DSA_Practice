import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("India", 100);
        hm.put("Japan", 150);
        hm.put("USA", 200);
        hm.put("China", 250);

        // get
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Suuu"));

        // // contains
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Suuu"));

        //remove
        // System.out.println(hm.remove("Suuu"));
        // System.out.println(hm);

        // System.out.println(hm.size());

        //iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key: "+k+ " ,Value: "+hm.get(k));
        }

    }
}