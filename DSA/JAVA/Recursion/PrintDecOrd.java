import java.util.*;

public class PrintDecOrd{

    public static int printDecOrd(int n){

        if(n==1){
            System.out.println(n);
            return 0;

        }
        System.out.println(n +" ") ;
      printDecOrd(n-1);
     
    }

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number ");
        int num = sc.nextInt();
        printDecOrd(num);




    }
    
}
