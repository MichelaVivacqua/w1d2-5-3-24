package esercizio4;

import java.util.Scanner;

public class esercizio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi un numero intero da cui far partire il conto alla rovescia");
        int timer = scanner.nextInt();
        System.out.println("Conto alla rovescia da " + timer + " a 0:");
        for (int i = timer; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
