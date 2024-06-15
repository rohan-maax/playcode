import java.util.*;
public class diamondPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);

        System.out.print("enter a number of line : ");
        int line =sc.nextInt();

        for(int i=1 ;i<=line/2 ;i++){
            for(int j=1 ; j<=line/2; j++){
                if(j<=line/2-i){
                    System.out.print(" ");

                }
                else{
                    System.out.print(" *");
                }

                
            }
            System.out.println();
        }

        for(int i=1 ;i<=line/2 ;i++){
            for(int j=1 ; j<=line/2; j++){
                if(j>=i){
                    System.out.print(" *");

                }
                else{
                    System.out.print(" ");
                }

                
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
