import java.util.*;

public class prime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number to check prime : ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {

                count++;
            }

        }
        if (count == 2) {

            System.out.print(num + " =  is prime number ");
        } else {

            System.out.print(num + " =  is prime not number ");
            sc.close();
        }
    }

}
