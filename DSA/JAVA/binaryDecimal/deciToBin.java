import java.util.*;

public class deciToBin {

    public static void deciToBin(int deciNum) {

        int myNum = deciNum;
        int binNum = 0;
        int pow = 0;

        while (deciNum > 0) {
            int rem = deciNum % 2;
            binNum = binNum + (rem* (int) Math.pow(10, pow));
            deciNum = deciNum / 2;
            pow++;

        }

        System.out.print("the binary number of " + myNum + " is " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a decimal number : ");
        int deciNum = sc.nextInt();

        deciToBin(deciNum);
    }

}
