package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner digitUser = new Scanner(System.in);

        System.out.println("Digite a quantia de casos de teste");
        int n = digitUser.nextInt();
        digitUser.nextLine();

        for (int i = 0; i < n; i++) {
            String line = digitUser.nextLine();
            String decipheredLine = decipherLine(line);
            System.out.println(decipheredLine);
        }

        digitUser.close();
    }

    public static String decipherLine(String line) {
        int length = line.length();
        StringBuilder decipheredLine = new StringBuilder();

        for (int i = length / 2 - 1; i >= 0; i--) {
            decipheredLine.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            decipheredLine.append(line.charAt(i));
        }

        return decipheredLine.toString();

    }
}