package org.example;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int prova1; //prova1 tem peso 2
        int prova2; // prova2 tem peso 3
        int prova3; // prova3 tem peso 5

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota da prova 1: ");
        prova1 = entrada.nextInt();
        System.out.println("Digite a nota da prova 2: ");
        prova2 = entrada.nextInt();
        System.out.println("Digite a nota da prova 3: ");
        prova3 = entrada.nextInt();
        System.out.println("A media do Aluno é de: ");
        System.out.println(((prova1*2) + (prova2*3) + (prova3*5)) / 10);
    }
}
