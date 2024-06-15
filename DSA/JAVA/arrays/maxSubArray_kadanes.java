public class maxSubArray_kadanes {

    public static void getMaxSubArray(int data[]){

        int maxSum=Integer.MIN_VALUE;
        int currSum= 0;

        for (int i=0; i<data.length; i++){

            currSum= currSum+ data[i];
            if (currSum<0){
                currSum=0;

            }
            maxSum=Math.max(maxSum, currSum);
        }

        System.out.println("maximum subarray is = "+ maxSum);
    }
    public static void main(String[] args){
        int data []= {-2,-3,4,-1,-2,1,5,-3 };
        getMaxSubArray(data);
    }
    
}
