import java.util.*;

public class decimalToBin {

    static void generatePrintBinary(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.print(s1+ " ");
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public static void main(String[] args) {

        generatePrintBinary(10);
        // Queue<String> q = new LinkedList<>();

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        //     String bin = Integer.toBinaryString(i);
        //     q.add(bin);

        // }

        // System.out.println(q);

    }
}
