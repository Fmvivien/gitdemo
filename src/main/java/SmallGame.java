import java.util.Random;
import java.util.Scanner;

    public class SmallGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int helyesValaszokSzama = 0;

            System.out.println("=== Szorzótábla Minigame (0-10) ===");
            System.out.println("Érj el 5 helyes választ a gyémánt megszerzéséhez!\n");

            // Addig fut a játék, amíg nincs meg az 5 helyes válasz
            while (helyesValaszokSzama < 5) {
                int szam1 = random.nextInt(11);
                int szam2 = random.nextInt(11);
                int helyesEredmeny = szam1 * szam2;

                System.out.print((helyesValaszokSzama + 1) + ". sikeres feladat következik: " + szam1 + " * " + szam2 + " = ");

                // Biztonságos beolvasás (csak számot fogad el)
                while (!scanner.hasNextInt()) {
                    System.out.println("Kérlek, egy számot adj meg!");
                    System.out.print(szam1 + " * " + szam2 + " = ");
                    scanner.next();
                }
                int felhasznaloValasza = scanner.nextInt();

                if (felhasznaloValasza == helyesEredmeny) {
                    helyesValaszokSzama++;
                    System.out.println("Helyes! Eddigi sikeres válaszok: " + helyesValaszokSzama + "/5\n");
                } else {
                    System.out.println("Sajnos hibás. A helyes válasz: " + helyesEredmeny + ". Próbáld újra!\n");
                }
            }

            // Gyémánt alakzat kirajzolása
            System.out.println("Gratulálok! Megvan az 5 helyes válasz! Íme a gyémántod:\n");
            kirajzolGyemant(5);

            scanner.close();
        }

        // Metódus a gyémánt kirajzolásához
        public static void kirajzolGyemant(int magassag) {
            // Felső rész
            for (int i = 1; i <= magassag; i++) {
                for (int j = magassag; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Alsó rész
            for (int i = magassag - 1; i >= 1; i--) {
                for (int j = magassag; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }