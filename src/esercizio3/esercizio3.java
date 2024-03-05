import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci una stringa o ':q' per uscire:");
            String stringaInserita = scanner.nextLine();

            if (stringaInserita.equals(":q")) {
                System.out.println("Arrivederci!");
                break;
            }


            String caratteriSeparati = "";
            for (int i = 0; i < stringaInserita.length(); i++) {
                caratteriSeparati += stringaInserita.charAt(i);
                if (i != stringaInserita.length() - 1) {
                    caratteriSeparati += ",";
                }
            }

            System.out.println("Caratteri separati dalla virgola: " + caratteriSeparati);
        }

        scanner.close();
    }
}
