public class maxSubArrays_prefixSum {
    public static void getMaxSubArray(int data[]) {

        int Maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        int prefix[] = new int[data.length];
        prefix[0] = data[0];

        // calculate prefix arrays

        for (int i = 1; i < prefix.length; i++) {

            prefix[i] = prefix[i - 1] + data[i];
        }
        for (int i = 0; i < data.length; i++) {
            int start = i;
            for (int j = i; j < data.length; j++) {
                int end = j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (Maxsum < currsum) {

                    Maxsum = currsum;
                }

            }
        }
        System.out.print(" maximum subarray sum is : " + Maxsum);
    }

    public static void main(String[] args) {
        int data[] = { 2, 5, -3, 6, -7, 4 };

        getMaxSubArray(data);

    }

}
