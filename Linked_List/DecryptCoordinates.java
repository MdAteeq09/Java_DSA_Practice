import java.util.Scanner;

public class DecryptCoordinates {


    public static int getValue(String s) {

        int[] freq = new int[26];

        // Traverse string except last character (direction)
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);   // lowercase guaranteed
            freq[ch - 'a']++;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find min and max frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {       // ignore zero
                max = Math.max(max, freq[i]);
                min = Math.min(min, freq[i]);
            }
        }

        return max - min;
    }

    // Function to get direction from last character
    public static String getDirection(char ch) {
        if (ch == 'n') return "North";
        if (ch == 's') return "South";
        if (ch == 'e') return "East";
        if (ch == 'w') return "West";
        return "Invalid";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input encrypted strings (lowercase)
        String s1 = sc.next(); // latitude
        String s2 = sc.next(); // longitude

        // Latitude
        int latValue = getValue(s1);
        String latDir = getDirection(s1.charAt(s1.length() - 1));

        // Longitude
        int longValue = getValue(s2);
        String longDir = getDirection(s2.charAt(s2.length() - 1));

        // Output
        System.out.println("Latitude  : " + latValue + " " + latDir);
        System.out.println("Longitude : " + longValue + " " + longDir);
    }
}
