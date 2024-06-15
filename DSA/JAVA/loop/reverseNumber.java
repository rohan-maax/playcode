
// reverse of a number 

public class reverseNumber {
    public static void main(String[] args) {

        // Scanner sc = new Scanner (System.in);

        int num = 1089900;

        while (num > 0) {

            int lastDigit = num % 10;

            System.out.print(lastDigit);

            num = num / 10;
        }
      


    }

}
