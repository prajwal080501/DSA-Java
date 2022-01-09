import java.util.Scanner;

public class MaxWealth {
    public static void maxWealth(int[][] accounts) {
        int max = 0;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("\nMaximum wealth is : " + max);
    }

    public static void main(String[] args) {
        int rowSize, colSize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        rowSize = sc.nextInt();
        colSize = sc.nextInt();
        int[][] accounts = new int[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        for (int c = 0; c < colSize; c++) {
            for (int r = 0; r < rowSize; r++) {
                System.out.print(accounts[r][c] + " ");
            }
            System.out.println();
        }

        maxWealth(accounts);
    }
}