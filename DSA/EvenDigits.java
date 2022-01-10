

import java.util.Scanner;

public class EvenDigits {
    public static void evenDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("\nNumber of even digits are : " + count);
    }


    public static void accept(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements  :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arraySize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        arraySize = sc.nextInt();
        int[] arr = new int[arraySize];
        accept(arr);
        display(arr);
        evenDigits(arr);

        sc.close();

    }
    
}
