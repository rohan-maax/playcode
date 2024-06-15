public class largestNumber {
    public static int getLargest(int marks[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {

            if (largest < marks[i]) {
                largest = marks[i];
            }

        }
        return largest;

    }

    public static void main(String[] args) {
        int marks[] = { 98, 76, 94, 66, 88, 34, 98, 49 };

        System.out.print(" maximum marks : " + getLargest(marks));

    }

}
