import java.util.*;
public class digitSum {

    public static void digitSum(long digit){
       long mydigit= digit;
        long sum=0;

        while(digit>0){
            long lastdigit= digit%10;

            sum=sum+lastdigit;
            digit=digit/10;
        }

        System.out.print("the individual sum of digit " + mydigit+" is  : "+ sum);
        }

        public static void main(String[] args ){

            Scanner sc = new Scanner(System.in);
            System.out.print("enter a digit (min. length of digit 2 ) : ");
            long digit=sc.nextLong();

            digitSum(digit);
        }


    
}
