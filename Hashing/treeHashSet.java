import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class treeHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Nanded");
        cities.add("Hydrabad");
        cities.add("Pune");
        cities.add("Nagpur");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Nanded");
        lhs.add("Hydrabad");
        lhs.add("Pune");
        lhs.add("Nagpur");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Nanded");
        ts.add("Hydrabad");
        ts.add("Pune");
        ts.add("Nagpur");
        System.out.println(ts);
    }
}
