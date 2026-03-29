import java.util.HashSet;
import java.util.Iterator;

public class iterationOnHs {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Nanded");
        cities.add("Hydrabad");
        cities.add("Pune");
        cities.add("Nagpur");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
