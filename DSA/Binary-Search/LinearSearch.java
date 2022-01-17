
//Linear Search Algorithm

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        s = sc.nextInt();
        int[] arr = new int[s];
        accept(arr, s);
        display(arr, s);
        int key;
        System.out.println("Enter a key element to search in array: ");
        key = sc.nextInt();
        linearSearch(arr, s, key);
        sc.close();

    }

    static void accept(int arr[], int size) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

    }

    static void display(int arr[], int size){
        for(int i = 0; i< size; i++){
            System.out.println(arr[i]);
        }
    }

    static void linearSearch(int arr[], int size, int key){
        int comparisonCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                break;
            }
            comparisonCount++;

        }
        System.out.println("Number of comparisons: " + comparisonCount);
        System.out.println("Element not found");

    }
}


