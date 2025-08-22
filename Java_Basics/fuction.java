import java.util.*;
public class fuction {
    public static void main(String arug[]){

        Scanner sc= new Scanner(System.in);
         
        System.out.print("Enter the number:");
        int digits = sc.nextInt();

        System.out.println("The sum is" + sumDigits(digits));

        
    }
    public static int sumDigits(int n){
        int sumofDigits = 0;

        while (n>0) {
            int lastDigit = n % 10;
            sumofDigits += lastDigit;
            n /= 10;
        }
         return sumofDigits;
         
    }
}
