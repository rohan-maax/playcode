import java.util.*;

public class switch_week {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("input a number (1-7) :" );
        int week = sc.nextInt();


        switch(week){

           case  1 : System.out.println("Monday");
                      break;
           case  2 : System.out.println("Tuesday");
                      break;
           case  3 : System.out.println("Wednesday");
                      break;
           case  4 : System.out.println("Thursday");
                      break;
           case  5 : System.out.println("Friday");
                      break;
           case  6 : System.out.println("Satureday");
                      break;
           case  7 : System.out.println("Sunday");
                      break;
            default : System.out.print("enter a valid number ");
        }

        sc.close();


    }

    
}
