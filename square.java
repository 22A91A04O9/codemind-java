import java.util.Scanner;

public class HollowSquare {
    public static void printHollowSquare(int n) {
        for (int i = 0; i < n; i++) {  // Loop for rows
            for (int j = 0; j < n; j++) {  // Loop for columns
                // Print '*' if it's the first or last row, or first or last column
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space inside the square
                }
            }
            System.out.println();  // Move to the next line
        }
    }