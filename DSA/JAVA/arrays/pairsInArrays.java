public class pairsInArrays {

    public static void arraysPairs(int data[]) {

        int countPair = 0;

        for (int i = 0; i < data.length; i++) {

            int curr = data[i];

            for (int j = i + 1; j < data.length; j++) {

                System.out.print("(" + curr + "," + data[j] + ")");
                countPair++;
            }

            System.out.println();
        }
        System.out.println("the number of pairs is : " + countPair);
        System.out.println();

    }

    public static void main(String[] args) {

        int data[] = { 2, 4, 6, 8, 10 };

        arraysPairs(data);
    }

}
