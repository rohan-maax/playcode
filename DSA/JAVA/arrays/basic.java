import java.util.*;

public class basic {

    // public static void upadateMarks(int marks[]) {

    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i] = marks[i] + i;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int marks[] = new int[5];

    //     System.out.print("enter marks of Math : ");
    //     marks[0] = sc.nextInt();
    //     System.out.print("enter marks of History : ");
    //     marks[1] = sc.nextInt();
    //     System.out.print("enter marks of English : ");
    //     marks[2] = sc.nextInt();
    //     System.out.print("enter marks of Physics : ");
    //     marks[3] = sc.nextInt();
    //     System.out.print("enter marks of Chemistry : ");
    //     marks[4] = sc.nextInt();

    //     System.out.println("<---------marks before update ------->");
    //     System.out.println("Math : " + marks[0]);
    //     System.out.println("History: " + marks[1]);
    //     System.out.println("English: " + marks[2]);
    //     System.out.println("Physics: " + marks[3]);
    //     System.out.println("Chemistry : " + marks[4]);

    //     upadateMarks(marks); 

    //     System.out.println("<---------marks after update ------->");
    //     System.out.println("Math : " + marks[0]);
    //     System.out.println("History: " + marks[1]);
    //     System.out.println("English: " + marks[2]);
    //     System.out.println("Physics: " + marks[3]);
    //     System.out.println("Chemistry : " + marks[4]);
       

    // }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a value of colum : ");
        int col= sc.nextInt();
        
        System.out.print("enter a value of ROW : ");
        int row= sc.nextInt();
        
        int arr[][]= new int [col][row];


        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){

                System.out.print(" enter a value : ");
               arr[i][j]= sc.nextInt();
            }
        }
    
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){

                System.out.println(" the index value is " + arr[i][j]);
               
            }
            System.out.println();
        }
    }

}
