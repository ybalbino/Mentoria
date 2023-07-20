package org.example;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double altura;
        double largura;
        double profundidade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digito a altura em centimentos da caixa d'água: ");
        altura = entrada.nextDouble();
        System.out.println("Digito a largura em centimentos da caixa d'água: ");
        largura = entrada.nextDouble();
        System.out.println("Digito a profundidade em centimentos da caixa d'água: ");
        profundidade = entrada.nextDouble();

        System.out.println("Abaixo o volume da caixa d'água de acordo com os valores informados: ");
        System.out.println(altura * largura * profundidade + " " + "cm");
    }
}
