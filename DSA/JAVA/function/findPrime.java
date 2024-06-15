
import java.util.*;

public class findPrime{

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.print("enter value of to check prime : ");
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }
}