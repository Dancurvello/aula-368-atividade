package org.example;

import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int valor = scanner.nextInt();

        int soma = 0;
        for (int i = 2; i <= valor; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números pares até " + valor + " é: " + soma);

        scanner.close();
    }
}

