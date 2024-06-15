import java.util.*;

public class pallindrome {

    public static void pallindrome(long num) {

        long myNum = num;
        long rev = 0;
        while (num > 0) {

            long rem = num % 10;
            rev = (rev * 10) + rem;

            num = num / 10;
        }

        if (myNum == rev) {

            System.out.print("the number is pallindorme");
        }

        else {
            System.out.print("the number is not pallindrome ");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to check pallindrome : ");
        long num = sc.nextLong();

        pallindrome(num);

    }

}
