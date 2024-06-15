import java.util.*;

public class hollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number of line : ");
        int line = sc.nextInt();

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line - i; j++) {

                System.out.print("  ");
            }
            for (int k = 1; k <= line; k++) {

                if (i == 1 || i == line || k == 1 || k == line) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
