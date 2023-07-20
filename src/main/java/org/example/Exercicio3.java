package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int numA;
        int numB;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro; ");
        numA = entrada.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        numB = entrada.nextInt();

        System.out.println("Segue a impressão dos numeros invertidos: ");
        System.out.println(numB + " " + numA);
    }
}
