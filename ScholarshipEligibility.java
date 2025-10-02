import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mesatarja = scanner.nextDouble();
        boolean kaCertifikateOlimpiade = scanner.nextBoolean();
        int teArdhuratFamiljare = scanner.nextInt();

        if (mesatarja < 0 || mesatarja > 10 || teArdhuratFamiljare <= 0) {
            System.out.println("Te dhena te pavlefshme");
            return;
        }

        if (mesatarja >= 9.5 || kaCertifikateOlimpiade) {
            System.out.println("Burse e plote");
            System.out.println("Arsye: mesatarja ≥ 9.5 ose ka certifikate olimpiade.");
        } else if (mesatarja >= 8.5 && teArdhuratFamiljare < 50000) {
            System.out.println("Burse e pjesshme");
            System.out.println("Arsye: mesatarja ≥ 8.5 dhe te ardhurat < 50000.");
        } else {
            System.out.println("Nuk kualifikohet");
            System.out.println("Arsye: nuk ploteson kushte per burse.");
        }
    }
}
