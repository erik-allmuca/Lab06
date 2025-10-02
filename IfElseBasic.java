import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean eshteNxenes = scanner.nextBoolean();
        System.out.println("Status: nxenes = " + eshteNxenes);
        if (eshteNxenes) {
            System.out.println("Zbritje nxenesi: PO");
        } else {
            System.out.println("Zbritje nxenesi: JO");
        }
    }
}
