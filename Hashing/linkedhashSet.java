import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashSet {
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
    }
}
