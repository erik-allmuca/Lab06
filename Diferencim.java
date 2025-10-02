import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mesatarja = scanner.nextDouble();
        boolean kaCertifikateOlimpiade = scanner.nextBoolean();
        int teArdhuratFamiljare = scanner.nextInt();

        if (mesatarja < 0) {
            System.out.println("Kontroll: mesatarja < 0");
            System.out.println("Te dhena te pavlefshme");
            return;
        }
        if (mesatarja > 10) {
            System.out.println("Kontroll: mesatarja > 10");
            System.out.println("Te dhena te pavlefshme");
            return;
        }
        if (teArdhuratFamiljare <= 0) {
            System.out.println("Kontroll: te ardhurat familjare <= 0");
            System.out.println("Te dhena te pavlefshme");
            return;
        }

        if (mesatarja >= 9.5) {
            System.out.println("Kontroll: mesatarja >= 9.5");
            System.out.println("Burse e plote");
            System.out.println("Arsye: mesatarja >= 9.5.");
        } else if (kaCertifikateOlimpiade) {
            System.out.println("Kontroll: ka certifikate olimpiade = true");
            System.out.println("Burse e plote");
            System.out.println("Arsye: ka certifikate olimpiade.");
        } else if (mesatarja >= 9.0 && teArdhuratFamiljare < 30000) {
            System.out.println("Kontroll: mesatarja >= 9.0 dhe te ardhurat < 30000");
            System.out.println("Burse e plote");
            System.out.println("Arsye: mesatarja >= 9.0 dhe te ardhurat familjare < 30000.");
        } else if (mesatarja >= 8.5 && teArdhuratFamiljare < 50000) {
            System.out.println("Kontroll: mesatarja >= 8.5 dhe te ardhurat < 50000");
            System.out.println("Burse e pjesshme");
            System.out.println("Arsye: mesatarja >= 8.5 dhe te ardhurat familjare < 50000.");
        } else {
            System.out.println("Kontroll: nuk ploteso asnje kusht per burse");
            System.out.println("Nuk kualifikohet");
            System.out.println("Arsye: nuk ploteson asnje kusht per burse.");
        }
    }
}
