import java.util.Scanner;

public class Projekt {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "Vivien üdvözöl";
        System.out.println(name);

        Scanner scan = new Scanner(System.in);
        System.out.print("Kérlek, add meg a neved: ");
        String yourName = scan.nextLine();
        System.out.println("Üdvözöljük a rendszerben, " + yourName + "!\n");

        // 2. Adatbekérés
        System.out.print("Kérlek, add meg a lekötni kívánt összeget (Ft): ");
        double toke = scan.nextDouble();

        System.out.print("Hány évre szeretnéd lekötni a pénzed? (1-5 év): ");
        int year = scan.nextInt();

        // kamatláb: 5% (0.05)
        double kamatlab = 0.05;

        // 3. Ellenőrzés
        if (toke <= 0 || year <= 0 || year > 5) {
            System.out.println("Hiba: Érvénytelen összeget vagy futamidőt adtál meg!");
        } else {
            System.out.println("\n--- Kamatperiódus előrejelzés ---");

            // 4. Kamatszámítás évenként
            double aktualisOsszeg = toke;
            for (int i = 1; i <= year; i++) {
                double kamat = aktualisOsszeg * kamatlab;
                aktualisOsszeg += kamat;

                System.out.printf("%d. év végén a várható egyenleg: %,.0f Ft%n", i, aktualisOsszeg);
            }

            // 5. Összegzés
            double tisztaHaszon = aktualisOsszeg - toke;
            System.out.println("\n---------------------------------");
            System.out.printf("A futamidő végén a tiszta kamatnyereség: %,.0f Ft%n", tisztaHaszon);
        }

        scan.close();
    }
}