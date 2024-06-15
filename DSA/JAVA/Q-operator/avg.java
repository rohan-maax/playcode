import java.util.*;

public class avg {
    public static void main(String[] args) {

        System.out.println("enter value of first three number : ");
        Scanner avg = new Scanner(System.in);
        int a =  avg.nextInt();
        int b =  avg.nextInt();
        int c =  avg.nextInt();

        double avg_of_three = (a+b+c)/3;

        System.out.println(avg_of_three);
        avg.close();
    }
}
