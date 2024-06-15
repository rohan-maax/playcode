import java.util.*;

public class avgOFthree {

    public static void avg(float  x , float  y,float z){
       

        double avgOFthree= (x+y+z)/3;

        System.out.print("the avg value of three is :"+ avgOFthree);

}

    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);

        System.out.print("enter a value of num1 :");
        float num1= sc.nextFloat();
        System.out.print("enter a value of num2 :");
        float num2= sc.nextFloat();
        System.out.print("enter a value of num3 :");
        float num3= sc.nextFloat();
        

        avg(num1,num2,num3);
    }
    
}
