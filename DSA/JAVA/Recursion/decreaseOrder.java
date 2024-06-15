import java.util.*;

public class decreaseOrder {

    public static int printDecOrd(int n) {

        if (n == 1) {
            System.out.println(n);
            return 0;

        }
        System.out.print(n + " ");
        printDecOrd(n - 1);

        return 0;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number  : ");
        int num = sc.nextInt();
        printDecOrd(num);

    }

}
