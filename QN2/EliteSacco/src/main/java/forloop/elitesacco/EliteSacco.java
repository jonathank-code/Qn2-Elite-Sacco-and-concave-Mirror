
package forloop.elitesacco;

import java.util.Scanner;

public class EliteSacco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = input.nextInt();

        double rate = 0.05; // 5% interest rate

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTeacher " + i + ":");
            System.out.print("Enter principal amount (UGX): ");
            double principal = input.nextDouble();

            System.out.print("Enter time in years: ");
            int time = input.nextInt();

            double value = principal * Math.pow(1 + rate, time);
            System.out.println("Value after " + time + " years = UGX " + value);
        }

        input.close();
    }
}
