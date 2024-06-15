import java.util.*;

public class binToDeci {

    public static void binToDeci(long n){
            long deciNum=0;
           long myNum= n;
           int  pow=0;
           while(n>0){
           long lastDigit=n%10;
           deciNum= deciNum+(lastDigit*(long)Math.pow(2,pow));
           pow++;

           n=n/10;

           }
           System.out.print("the decimal number of "+myNum+" is "+ deciNum);

            


    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a binary number : ");
        long binNum=sc.nextLong();

        binToDeci(binNum);


    }


    
    
}
