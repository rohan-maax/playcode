import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner bill = new Scanner (System.in);
        System.out.println("enter a price value of pencil : " );
        float pencil= bill.nextFloat();
        
        
        System.out.println("enter a price value of pen : ");
        float pen = bill.nextFloat();
        
        System.out.println(" enter a value of eraser : ");
        float eraser = bill.nextFloat();

        float gst = (pencil+pen+eraser)*18/100;

        float final_bill= (pencil+pen+eraser+gst);

        System.out.println("the final bill with gst : " + (final_bill));

        bill.close();
        


        
    }
    
}
