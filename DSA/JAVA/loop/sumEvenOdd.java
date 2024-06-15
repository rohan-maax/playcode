import java.util.*;

public class sumEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");

        int n = sc.nextInt();

        System.out.println("the set of " + n + " numbers is below .....");

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {

                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + i;

            }

        }

        System.out.println("the sum of all even numbers is = " + evenSum);
        System.out.println("the sum of all odd numbers is = " + oddSum);
        sc.close();


    }
}