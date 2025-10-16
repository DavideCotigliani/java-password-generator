package org.lessons.java.security;
import java.util.Scanner;
public class PasswordGenerator {
public static void main(String[] args) {
    String nome;
    String cognome;
    String colorePreferito;
    int giornoNascita;
    int meseNascita;
    int annoNascita;
    
    Scanner input = new Scanner(System.in);

    nome = input.nextLine();
    cognome = input.nextLine();
    colorePreferito = input.nextLine();
    giornoNascita = input.nextInt();
    meseNascita = input.nextInt();
    annoNascita = input.nextInt();

    int sommaNascita = giornoNascita + meseNascita + annoNascita;

    String passwordGenerata = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaNascita;

    System.out.println("La password generata è:" + passwordGenerata);
}
}
