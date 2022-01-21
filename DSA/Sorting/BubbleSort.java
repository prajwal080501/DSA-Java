// Bubble sort algorithim 
// also known as inplace sorting algroithim

// space complexity: O(1) means no extra space is used
package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {


    public static int bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 4, 3, 7, 6 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}