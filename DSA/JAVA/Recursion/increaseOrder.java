import java.util.*;

public class increaseOrder {

    public static int increaseOrder(int n){

        if (n==0){

           
           return 0;
        }

        increaseOrder(n-1);
        System.out.print(n + " ");

        return 0;

    }
 
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.print(" enter a number : ");
        int num= sc.nextInt();
        increaseOrder(num);


    }

    
}
