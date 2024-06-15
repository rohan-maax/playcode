public class subArrays {
    public static void getSubArrays(int data[]) {

        for (int i = 0; i < data.length; i++) {

            int start = i;
            for (int j = i; j < data.length; j++) {
                int end=j;

                for (int k = start; k <= end; k++) {

                    System.out.print(data[k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int data[] = { 2, 4, 6, 8, 10 };
        getSubArrays(data);

    }

}
