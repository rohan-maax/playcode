public class smallestNumber {

    public static int getsmallest(int marks[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < marks.length; i++) {

            if (smallest > marks[i]) {
                smallest = marks[i];
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        int marks[] = { 56, 7, 65, 43, 56, 87, 64, 57, 8, 9 };

        System.out.print("minimum marks : " + getsmallest(marks));

    }

}
