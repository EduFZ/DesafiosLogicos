package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner digit = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int n = digit.nextInt();

        System.out.println("Digite o valor alvo: ");
        int k = digit.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = digit.nextInt();
        }

        int count = countPairs(arr, k);
        System.out.println(count);

        digit.close();
    }

    public static int countPairs(int[] arr, int k) {

        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int x : arr) {
            if (set.contains(x + k)) {
                count++;
            }
            if (set.contains(x - k)) {
                count++;
            }
            set.add(x);
        }

        return count;

    }
}