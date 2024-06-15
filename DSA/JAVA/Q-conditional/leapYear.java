
import java.util.*;

public class leapYear {
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print(" enter a year : ");
        int year= sc.nextInt();

        if((year%100!=0 && year%4==0 )||(year%400==0 ) ){

            System.out.println(year +" "+ "is leap year");
        }
        else{

            System.out.print(year+ " " + "is not leap year ");
        }

        sc.close();

    }
    
}
