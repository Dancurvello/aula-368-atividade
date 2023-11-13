package org.example;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIdades = 0;
        int numeroPessoas = 20;

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();
            totalIdades += idade;
        }

        double media = (double) totalIdades / numeroPessoas;

        System.out.println("A média das idades é: " + media);

        scanner.close();
    }
}

