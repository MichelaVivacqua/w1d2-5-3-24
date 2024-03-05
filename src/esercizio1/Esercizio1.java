package esercizio1;

public class Esercizio1 {
    public static void main(String[] args) {
       System.out.printf("Hello World!");

        String pariODispari = "trentatre";
        if (pariODispari.length() % 2 == 0)
        System.out.println("La stringa ha un numero pari di caratteri");
        else System.out.println("La stringa ha un numero dispari di caratteri");

        int annoBisestile = 1999;
        if (annoBisestile % 100 == 0 && annoBisestile % 400 == 0 && annoBisestile % 4 == 0)
            System.out.println("L'anno è bisestile");
        else System.out.println("L'anno non è bisestile");
    }
}