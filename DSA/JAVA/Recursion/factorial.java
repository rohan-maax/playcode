import java.util.*;

public class factorial {

    public static int fact(int n){

        if(n==0){
            return 1;
        }

        int fnm1= fact(n-1);
        int fact = n*fnm1;

        return fact;
    }

    public static void main(String args[]){

    Scanner sc= new Scanner(System.in);

    System.out.print("enter a number : ");
    int num= sc.nextInt();

    System.out.print(fact(num));

}
    
}
