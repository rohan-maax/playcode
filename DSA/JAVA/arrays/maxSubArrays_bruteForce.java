public class maxSubArrays_bruteForce {
    public static void getMaxSubArray(int data[]){

        int Maxsum= Integer.MIN_VALUE;
        int currsum= 0;
        for(int i=0; i<data.length; i++){
            int start= i;
            for(int j=i; j<data.length; j++){
                int end=j;
                currsum=0;
                for (int k= start; k<=end; k++){

                    currsum+= data[k];
                }
                System.out.println(currsum);
                if(Maxsum<currsum){

                    Maxsum=currsum;
                }

        
            }
        }
        System.out.print(" maximum subarray sum is : "+ Maxsum);
    }

    public static void main(String[] args){
        int data[]= {2,5,-3,6,-7,4};

getMaxSubArray(data);

    }
}