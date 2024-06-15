import java.util.*;

public class check_fever {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a temp in ferhanite  :");
        double temp = sc.nextDouble();

        if (temp <= 100) {

            System.out.println(" you dont  have fever ");

        } else {
            System.out.println(" you have a fever ");
        }
        sc.close();

    }

}
