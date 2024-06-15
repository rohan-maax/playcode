import java.util.*;

public class Get_ith_Bit{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int num = sc.nextInt();

        System.out.print("enter a position number what you want to get :  ");
        int position = sc.nextInt();

        int bitMask = 1 << position;
        int result = (num & bitMask) ;

        if(result == 0 ){
            System.out.print("result of given position is : "+ result);
        }else {
            System.out.print("result of given position is : "+ result);


        }




    }
}