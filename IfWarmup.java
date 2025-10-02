import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mosha = scanner.nextInt();
        if (mosha <= 0) {
            System.out.println("Mosha e pavlefshme");
            return;
        }
        if (mosha >= 18) {
            System.out.println("Mbi 18 (i/e rritur)");
        }
    }
}
