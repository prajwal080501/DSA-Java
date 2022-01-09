package DSA;


import java.util.Scanner;
public class MaxMinIn2DArray {

    public static void maxIn2DArray(int[][] arr) {
        int max = arr[0][0];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] > max) {
                    max = arr[r][c];
                }
            }

        }
        System.out.println("Max element in array is : " + max);
    }

    public static void minIn2DArray(int[][] arr) {
        int min = arr[0][0];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] < min) {
                    min = arr[r][c];
                }
            }
        }
        System.out.println("Min element in array is : " + min);
    }

    public static void main(String[] args) {
        int rowSize,  columnSize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        rowSize = sc.nextInt();
        columnSize = sc.nextInt();

        int[][] arr = new int[rowSize][columnSize];

        System.out.println("Enter the elements of the array");
        for(int r = 0; r< arr.length; r++){
            for(int c = 0; c< arr[r].length; c++){
                arr[r][c] = sc.nextInt();
            }
        }

        System.out.println("The elements in array are: ");
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
        maxIn2DArray(arr);
        minIn2DArray(arr);
        }
        
    }
