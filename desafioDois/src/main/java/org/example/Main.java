package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner digit = new Scanner(System.in);
        digit.useLocale(Locale.US);

        System.out.println("Digite o valor monetário: ");
        double valor = digit.nextDouble();

        System.out.println("NOTAS:");
        int[] notas = {100, 50, 20, 10, 5, 2};
        for (int nota : notas) {
            int quantidade = (int) (valor / nota);
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, (double) nota);
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        double[] moedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        for (double moeda : moedas) {
            int quantidade = (int) (valor / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda);
            valor %= moeda;
        }

        digit.close();


    }
}