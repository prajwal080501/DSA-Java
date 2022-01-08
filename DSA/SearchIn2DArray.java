package DSA;

import java.util.*;

public class SearchIn2DArray {

    public static int linearSearch2DArray(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == target) {
                    return 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int rowSize, columnSize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        rowSize = sc.nextInt();
        columnSize = sc.nextInt();
        int[][] arr = new int[rowSize][columnSize];

        System.out.println("Enter the elements of the array");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = sc.nextInt();
            }
        }
        System.out.println("Elements in array are : ");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        int key;
        System.out.println("Enter the key to search");
        key = sc.nextInt();
        int result = linearSearch2DArray(arr, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }
    }
}