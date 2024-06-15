import java.util.*;

public class Clear_ith_Bit {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int num = sc.nextInt();

        System.out.print("enter a position number what you want to clear :  ");
        int position = sc.nextInt();

        int bitMask = ~(1 << position);
        int result = (num | bitMask) ;

        System.out.print("the result of after clear bit : "+ result);


    }
    
}
