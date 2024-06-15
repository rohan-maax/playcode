
import java.util.*;

public class invertedRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number of line : ");
        int line = sc.nextInt();

        for (int i = 0; i <= line; i++) {

            for (int j = 0; j <= line; j++) {

                if (j >= line - i) {
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
