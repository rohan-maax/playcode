
public class bubbleSorting {
    public static void bubbleSorting(int arr[]) {
        for (int turn = 0; turn <arr.length-1; turn++) {
            for (int j = 0; j <arr.length-1- turn; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }

        }

    }

    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        System.out.print("Before sorting-->");
    
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        
        
        
        

        bubbleSorting(arr);

        System.out.print("After sorting-->");
        
        print(arr);
       
    }

}


// public class bubbleSorting {
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");

//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 7, 8, 1, 3, 2, 5 };
//         // time complexity:O(N^2)
//         // bubble sort
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {

//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                 }
//             }
//         }
//         printArray(arr);
//     }
// }
