package org.example;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é seu nome? ");
        nome = entrada.next();
        System.out.println("Qual seu sobrenome? ");
        sobrenome = entrada.next();
        System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
    }
}