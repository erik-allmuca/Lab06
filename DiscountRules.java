import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mosha = scanner.nextInt();
        boolean eshteNxenes = scanner.nextBoolean();
        double cmimiBaze = scanner.nextDouble();

        if (mosha <= 0 || cmimiBaze <= 0) {
            System.out.println("Input i pavlefshem");
            return;
        }

        int zbritje = 0;
        if (mosha < 6) {
            System.out.println("Zbritje: FALAS");
            System.out.println("Totali (lek): 0");
            return;
        } else if (mosha <= 18 || eshteNxenes) {
            zbritje = 30;
        } else if (mosha >= 65) {
            zbritje = 20;
        }

        double totali = cmimiBaze * (1 - zbritje / 100.0);
        System.out.println("Zbritje: " + zbritje + "%");
        System.out.println("Totali (lek): " + (int)Math.round(totali));
    }
}
