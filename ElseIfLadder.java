import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        if (nota < 0 || nota > 100) {
            System.out.println("Nota e pavlefshme");
            return;
        }
        if (nota >= 90) {
            System.out.println("Shkelqyer (A)");
        } else if (nota >= 75) {
            System.out.println("Shume mire (B)");
        } else if (nota >= 60) {
            System.out.println("Mire (C)");
        } else if (nota >= 40) {
            System.out.println("Mjaftueshem (D)");
        } else {
            System.out.println("Dobet (E)");
        }
        if (nota >= 40) {
            System.out.println("Kalo");
        } else {
            System.out.println("Jo kalo");
        }
    }
}
