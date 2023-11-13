package org.example;

import java.util.Scanner;

public class NumerosParesAnteriores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int valor = scanner.nextInt();

        System.out.println("Números pares anteriores a " + valor + ":");
        for (int i = 2; i < valor; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
