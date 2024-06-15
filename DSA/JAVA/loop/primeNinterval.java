import java.util.*;

public class primeNinterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a first interval number to print prime number : ");
        int num1 = sc.nextInt();
        System.out.print("enter a second interval number to print prime number : ");
        int num2 = sc.nextInt();
        int count = 0;

        for (int i = num1; i <= num2; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print( i + " is  prime number\n");
            } 
            else {
                System.out.print( i + " is not prime number\n ");

            }

            count = 0;
        }
        sc.close();

    }

}
