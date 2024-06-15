import java.util.*;

public class binaryLeftShift {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);

        System.out.print("Enter a value of decimal number :  ");
        int num = sc.nextInt();

        System.out.print("Enter a   position number you want to shift : ");
        int position = sc.nextInt();

        int Result = num<<position;

        System.out.println("result of binary left-shift(<<) operation : " + Result);

    }
    
}
