// 123
// 123
// 123

import java.util.Scanner;


public class pattern1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        int i = 1;

        while (i <= num) {

            int j = 1;
            while (j <= num) {
                System.out.println(j);
                j++;
            }
            i++;
        }
        sc.close();

    }
}