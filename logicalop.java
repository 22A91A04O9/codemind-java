public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        // Perform all the operations and print in a single line
        System.out.println((a && b) + " " + (a || b) + " " + (!a));
    }
}