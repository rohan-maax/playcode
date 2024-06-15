import java.util.*;

public class sumOFn {

    public static int sumofn(int n){

        if (n==0){
            return 0;

        }

        int nm1= sumofn(n-1);
        int sum= n+nm1;

        return sum;
    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.print("enter a number : ");
        int num = sc.nextInt();

        System.out.print(sumofn(num));

   }
    
}
