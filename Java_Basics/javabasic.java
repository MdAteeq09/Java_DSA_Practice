import java.util.*;

public class javabasic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pen + pencil + eraser;
        System.out.println("The total bill is: " + total);

        // Adding 18% GST
        float newTotal = total + (0.18f * total);
        System.out.println("Total with GST: " + newTotal);
    }
}