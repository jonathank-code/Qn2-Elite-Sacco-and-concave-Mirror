
package qn2.concavemirror;

import java.util.Scanner;

public class ConcaveMirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Accept u (object distance) and v (image distance)
        System.out.print("Enter the object distance u (cm): ");
        double u = input.nextDouble();
        System.out.print("Enter the image distance v (cm): ");
        double v = input.nextDouble();

        // Step 2: Ensure u is negative for concave mirror
        u = -Math.abs(u); // makes sure u is always negative

        // Step 3: Calculate focal length using the formula f = 1 / (1/v + 1/u)
        double f = 1 / ((1 / v) + (1 / u));

        // Step 4: Display the focal length
        System.out.printf("Calculated Focal Length (f): %.2f cm%n", f);

        // Step 5: Check if the focal length is acceptable
        if (f >= 21.0 && f <= 25.0) {
            System.out.println("Mirror is acceptable.");
        } else {
            System.out.println("Mirror is NOT acceptable.");
        }
        
        input.close();
        // analysing the code
        for (int row = 1; row <= 3; row++) {
    for (int count = 1; count <= (4 - row); count++) {
        System.out.print("*");
    }
    System.out.println();
}

    }
}
