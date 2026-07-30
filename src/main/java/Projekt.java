import java.util.Scanner;

public class Projekt {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "Vivien üdvözöl";
        System.out.println(name);
        System.out.println("Ez az első saját projektem");

        Scanner scan = new Scanner(System.in);
        System.out.println("Kérlek add meg a saját nevedet");
         String yourName = scan.nextLine();

        System.out.println("Üdv " + yourName);

    }
}
