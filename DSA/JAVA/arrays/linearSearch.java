import java.util.*;

public class linearSearch {

    public static int linearSearch(int data[], int searchNum) {

        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchNum) {
                return i;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = { 69, 4, 98, 6, 8, 63, 45, 9 };
        System.out.println("{ 69, 4, 98, 6, 8, 63, 45, 9 } ");
        System.out.print("enter a number for search index value : ");
        int searchNum = sc.nextInt();

        int index = linearSearch(data, searchNum);
        if (index == -1) {
            System.out.print("not found");

        } else {
            System.out.print("number is at index :" + index);
        }

    }

}
