import java.util.*;
public class oddEven {

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a number to check prime : ");
        int num=sc.nextInt();

        if(isEven(num)){

            System.out.print("number is even");

        }
        else{
            System.out.print("number is odd ");
        }

    }



    
}
