import java.util.*;

public class primeRange {

    public static boolean isPrime(int n){

        if(n==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){

                return false;
            }


        }
        return true;

    }

    public static void primeInRange(int a){
        for(int i=2; i<=a; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");


            }
            else{
                // System.out.print(i+ " ");

            }
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner (System.in);

        System.out.print(" enter a range to check prime : ");
        int n=sc.nextInt();

        primeInRange(n);
    }
    
}
