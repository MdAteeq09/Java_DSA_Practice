import java.util.*;
public class beautifulAL {
    public ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConque(1,1,res,n);
        return
        res;
    }
    private void divideConque(int start, int increment,ArrayList<Integer> res,int n) {
        if(start + increment > n) {
            res.add(start);
            return;
        }
        divideConque(start, 2*increment, res, n);
        divideConque(start + increment, 2*increment, res, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // Create an object of the class
        beautifulAL obj = new beautifulAL();
        ArrayList<Integer> result = obj.beautifulArray(n);

        // Print the result
        System.out.println("Beautiful ArrayList: " + result);

        sc.close();
    }
}
