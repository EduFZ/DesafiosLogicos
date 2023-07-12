package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite os números: ");
        Scanner number = new Scanner(System.in);

        int value = number.nextInt();
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < value; i++) {
            values.add(number.nextInt());
        }

        values.sort((a, b) -> {
            int comparacao = Integer.compare(a % 2, b % 2);
            if (comparacao != 0) {
                return comparacao;
            } else if (a % 2 == 0) {
                return Integer.compare(a, b);
            } else {
                return Integer.compare(b, a);
            }
        });

        for (int valor : values) {
            System.out.println(valor);
        }

        number.close();

    }
}