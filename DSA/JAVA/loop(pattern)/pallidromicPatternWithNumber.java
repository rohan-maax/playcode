import java.util.*;

public class pallidromicPatternWithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number of line : ");
        int line = sc.nextInt();

        for (int i = 0; i <= line; i++) {
            for (int j = line; j >= 2; j--) {

                if (j >= i) {

                    System.out.print("  ");
                } else {

                    System.out.print(" " + j);
                }

            }
            for (int k = 1; k <= line; k++) {

                if (k <= i) {

                    System.out.print(" "+k);
                } else {

                    System.out.print("  " );
                }
            }

            System.out.println();

        }

    }

}
