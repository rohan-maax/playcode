import java.util.*;

public class Product{

    public static void multi(int a, int b) {
        int multiply = a * b;

        System.out.println(" product of " + a + " and " + b + " is : " + multiply);

        // return multiply;

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value of a : ");
        int a = sc.nextInt();
        System.out.print("enter a value of b : ");
        int b = sc.nextInt();

       


      multi(a,b);
       


        sc.close();

    }

}
