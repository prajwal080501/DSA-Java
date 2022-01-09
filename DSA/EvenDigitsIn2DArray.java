package DSA;

import java.util.Scanner;

public class EvenDigitsIn2DArray {
    public static void EvenDigitIn2DArray(int arr[][]) {
        int evenNumber = arr[0][0];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] % 2 == 0) {
                    evenNumber = arr[r][c];
                    System.out.println("Element found at " + r + " " + c + "and number is : " + evenNumber);
                }
            }
        }
    }

    public static void accept(int arr[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements  :");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = sc.nextInt();
            }
        }
    }

    public static void display(int arr[][]) {
        System.out.println("Array elements are : ");
        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowSize, columnSize;
        System.out.println("Enter the number of rows and columns");
        rowSize = sc.nextInt();
        columnSize = sc.nextInt();
        int[][] arr = new int[rowSize][columnSize];
        accept(arr);
        display(arr);
        EvenDigitIn2DArray(arr);

        
    }
}
