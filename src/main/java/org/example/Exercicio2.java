package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        num1 = entrada.nextInt();
        System.out.println("Digite um numero inteiro: ");
        num2 = entrada.nextInt();
        System.out.println("A diferença entre os numeros: ");
        System.out.println(num1 + " " + num2);
        System.out.println(num1 - num2);
    }
}
