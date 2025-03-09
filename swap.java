import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Printing the swapped values in correct format
        System.out.println(a + " " + b);

        scanner.close();
    }
}

