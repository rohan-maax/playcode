import java.util.*;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number of line : ");
        int line = sc.nextInt();

        int number = 1;

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line; j++) {
                if (j >= line - i + 1) {
                    System.out.print(" " + number);
                } else {
                    System.out.print(" ");
                }

            }
            number++;
            System.out.println();

        }

    }

}
