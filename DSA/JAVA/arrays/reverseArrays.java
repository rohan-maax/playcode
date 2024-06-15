import java.util.*;

public class reverseArrays {
    public static void reverseArrays(int data[]) {
        int first = 0, last = data.length - 1;

        while (first < last) {

            int temp = data[first];
            data[first] = data[last];
            data[last] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int data[]= { 1,2,3,4,5,6,7,8,9,};
        int data[] = new int[9];
        System.out.print("enter integer values ");
        for (int i = 0; i < data.length; i++) {

            data[i] = sc.nextInt();
        }

        System.out.println("<-----------the original arrays------->>>>>");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }
        System.out.println();

        reverseArrays(data);
        System.out.println("<-----------the reverse arrays------->>>>>");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }
        System.out.println();

    }

}
