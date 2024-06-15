import java.util.*;

public class OddEven {

    // check if a number odd or even

    /*
     * if least signification bit (LSB) = 0 ----->> EVEN
     * if least signification bit (LSB) = 1 ----->> ODD
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bitMask = 1;

        System.out.print("Enter a decimal number to check : ");
        int num = sc.nextInt();

        int result = num & bitMask;

        if (result == 0) {
            System.out.print("the decimal number is EVEN");

        } else {
            System.out.print("the decimal number is ODD ");
        }

    }
}
