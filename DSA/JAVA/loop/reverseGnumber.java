import java.util.*;

public class reverseGnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of naumber : ");
        int num = sc.nextInt();

        int revNum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;

        }

        System.out.print(" the reverse number is : " + revNum);

        sc.close();


    }

}
