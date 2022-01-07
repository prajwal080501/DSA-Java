package DSA;

import java.util.Scanner;

public class LinearSearchInRange {

    public static boolean LinearSearchRange(int[] arr, int start, int end, int key) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return true;
            }
        }
        System.out.println("Element not found");
        return false;
    }
    
    public static void accept(int[] arr, int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int size = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int[] arr = new int[size];
        accept(arr, size);
        display(arr, size);
        int key;
        System.out.println("Enter a key element to search in array: ");
        key = sc.nextInt();
        LinearSearchRange(arr, 0, 3, key);

        
        
    }
}