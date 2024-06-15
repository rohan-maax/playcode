
import java.util.*;
public class floydsTrianglePattern {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number =  1 ;
        System.out.print("enter a number of line : ");
        int line = sc.nextInt();

        for (int i = 0; i <= line; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(number);
                number++;

            }
            

            System.out.println();
        }
        sc.close();


    }

}

    

