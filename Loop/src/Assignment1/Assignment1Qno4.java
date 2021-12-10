package Assignment1;

import java.util.Scanner;

public class Assignment1Qno4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number: ");
            int n = sc.nextInt();
            System.out.println("the integer are: ");
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
            System.out.println("the sum of number is");
            for (int i = 0; i < n; i++) {
                sum += i;

            }
            System.out.println(sum);

        }

    public static class Assignment1Qno5SquareStarPattern {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("*  ");
                    } else
                        System.out.print("*  ");
                }
                System.out.println();
            }
        }
    }
}