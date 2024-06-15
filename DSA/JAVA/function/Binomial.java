
import java.util.*;
public class Binomial {

    public static int factorial(int x) {

        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
}
        return fact;
    }

    public static int binocoffi(int a, int b) {

        int n = factorial(a);
        int r = factorial(b);
        int nmr = factorial(a - b);

        int binomial = n / r * nmr;
         return binomial;
   }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value of n : ");
        int n = sc.nextInt();

        System.out.print("enter a value of r :  ");
        int r = sc.nextInt();

        int ans = binocoffi(n, r);
        System.out.print("the binomial of the numbers is " + ans);

        sc.close();
    }

}
