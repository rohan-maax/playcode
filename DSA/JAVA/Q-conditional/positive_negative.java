import java.util.*;
public class positive_negative{
    public static void  main (String[] args){

        Scanner sc= new Scanner(System.in);
         System.out.print("enter a integer value :  ");
         float val = sc.nextFloat();

         if( val<0){
            System.out.println(val + "   is  negative number ");
            }
            else{
                System.out.println(val+" " +"is positive number ");
            }
         
            sc.close();


    }
    
    
}