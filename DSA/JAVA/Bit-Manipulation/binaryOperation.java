import java.util.*;

public class binaryOperation {

    public static void andOperation(int a, int b) {
        int andOperation = (a & b);
        System.out.println("Result of binary and(&) operation : " + andOperation);

    }

    public static void ORoperation(int a, int b) {
        int ORoperation = a | b;
        System.out.println("Result of OR(|) operation  : " + ORoperation);

    }

    public static void XORoperation(int a, int b) {

        int XORoperation = a ^ b;
        System.out.println("Result of XOR(^) operation : " + XORoperation);

    }

    public static void  NOT_operation(int a, int b){
        int NOT_operation1= ~(a);
        int NOT_operation2 = ~(b);
        
        System.out.println("Result of NOT(~) operation of "+ a + " : "+ NOT_operation1);                                                                                                                                                 
        System.out.println("Result of NOT(~) operation of "+ b + " : "+ NOT_operation2);                                                                                                                                                 
    }

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter value first : ");
        int firstValue = sc.nextInt();

        System.out.print("enter a value of second : ");
        int SecondValue = sc.nextInt();

        // Operation function call

        andOperation(firstValue, SecondValue);

        ORoperation(firstValue, SecondValue);

        XORoperation(firstValue, SecondValue);

        NOT_operation(firstValue, SecondValue);

        

    }
}