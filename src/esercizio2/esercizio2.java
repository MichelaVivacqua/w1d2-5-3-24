package esercizio2;

import java.util.Scanner;

public class esercizio2 {public static void main(String[] args) {
    System.out.printf("Hello World!");

    Scanner scanner = new Scanner(System.in);
    System.out.println("inserisci un numero intero");
    int numeroInserito = scanner.nextInt();
    switch (numeroInserito) {
        case 0 : {System.out.println("Hai inserito il numero 0");break;}
        case 1 : {System.out.println("Hai inserito il numero 1");break;}
        case 2 : {System.out.println("Hai inserito il numero 2");break;}
        case 3 : {System.out.println("Hai inserito il numero 3");break;}
        default:System.out.println("Errore");
    }

    scanner.close();
}}