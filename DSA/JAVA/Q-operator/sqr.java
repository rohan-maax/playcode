import java.util.*;
public class sqr {
    public static void main(String[] args){
        System.out.println("enter a value of side :");
        Scanner sqr = new Scanner(System.in);
        double side= sqr.nextDouble();
        
        double a_of_sqr = side*side;

        System.out.println("area of square :"+a_of_sqr );
        sqr.close();

    }
    
}
