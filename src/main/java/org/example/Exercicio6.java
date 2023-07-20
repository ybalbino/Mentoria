package org.example;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double base;
        double altura;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da base em centimetros: ");
        base = entrada.nextDouble();
        System.out.println("Digite o valor de altura em centimetros: ");
        altura = entrada.nextDouble();

        System.out.println("A area do triângulo é de: ");
        System.out.println((base * altura)/2 + " " + "cm");
    }
}
