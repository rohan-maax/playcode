import java.util.*;

public class factorial {

    public static void faactorial(int n){

        int fact =1;
        for(int i=1; i<=n; i++){
            fact= fact*i;

        }
        System.out.print("the facotrial of "+ n+ " is = "+ fact);
     
        
    
    }

    public static void main(String[] args){

        Scanner sc =new Scanner (System.in);
        System.out.print("enter a value of number : ");
        int num=sc.nextInt();

        faactorial(num);
    }
    
}
