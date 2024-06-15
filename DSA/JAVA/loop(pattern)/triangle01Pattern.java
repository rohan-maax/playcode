import java.util.*;

public class triangle01Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number of line : ");
        int line = sc.nextInt();
        int Number = 0;

        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {

                if ((i+j) % 2 == 0) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }

                Number++;
            }
            System.out.println();
            

        }
                   sc.close();
    }

}
