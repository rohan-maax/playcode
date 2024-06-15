import java.util.*;

public class mergeSort {

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {

            return;
        }

        // kaam

        int mid = si + (ei - si)/2;
        mergesort(arr, si, mid); // left part
        mergesort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {

                temp[k] = arr[i];
                i++; ;
            } else {

                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part

        while (i <= mid) {

            temp[k++] = arr[i++];

        }

        // right part

        while (j <= ei) {

            temp[k++] = arr[j++];

        }

        // copy temp to ORG arr

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th integers number : ");
            arr[i] = sc.nextInt();
        }

        // int arr[]={ 9,4,9,3,2,5};
        mergesort(arr, 0, arr.length - 1);
        printArr(arr);


    }

}