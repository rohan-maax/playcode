import java.util.*;

public class fibonacciNumber {

    public static int sumofnthfibo(int n){

    if (n==0|| n==1){
        return n;
    }
    int fnm1= sumofnthfibo(n-1);
    int fnm2= sumofnthfibo(n-2);

    int sum= fnm1+fnm2;

    return sum;


    }

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.print("enter a number : ");
        int num= sc.nextInt();

        System.out.print(sumofnthfibo(num));


    }
    
}
