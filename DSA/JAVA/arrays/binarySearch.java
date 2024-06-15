public class binarySearch {

    public static int binarySearch(int data[], int key) {

        int start = 0, end = data.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (data[mid] == key) {
                return mid;
            }

            if (data[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int data[] = { 2, 4, 6, 8, 10, 12, 14,16,18,20};
        int key = 16;

        System.out.print("index for key is " + binarySearch(data, key));
    }

}
