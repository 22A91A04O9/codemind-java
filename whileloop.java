import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ");
        int x = sc.nextInt();

        for (int i = x; i >= 0; i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}