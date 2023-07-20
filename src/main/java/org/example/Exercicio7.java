package org.example;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a distancia em Km: ");
        double distanciaKm = entrada.nextDouble();

        System.out.println("Digite a velocidade do veiculo (km/h): ");
        double velocidadeKmh = entrada.nextDouble();

        double velocidadeMs = velocidadeKmh / 3.6;
        System.out.printf("A velocidade do seu veiculo em m/s é de: %.2f m/s%n", velocidadeMs);

        double tempoHoras = distanciaKm / velocidadeKmh;
        System.out.printf("O tempo estimado da viagem de origem São Paulo e destino Rio de Janeiro é de: %.2f horas.%n" , tempoHoras );


    }
}
