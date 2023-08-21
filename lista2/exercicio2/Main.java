// Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
// um vetor dos números não comuns aos vetores

package lista2.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int vetSize = 10;
        Scanner teclado = new Scanner(System.in);

        int vet3Size = 0;

        int[] vet1 = new int[vetSize];
        int[] vet2 = new int[vetSize];
        int[] vet3 = new int[vetSize * 2];

        // Preenche o primeiro array
        for (int i = 0; i < vetSize; i++) {
            System.out.println("Informe o valor " + (i + 1) + " do vetor 1:");
            vet1[i] = teclado.nextInt();
        }

        // Preenche o segundo array
        for (int i = 0; i < vetSize; i++) {
            System.out.println("Informe o valor " + (i + 1) + " do vetor 2:");
            vet2[i] = teclado.nextInt();
        }

        // Procura duplicatas
        for (int i = 0; i < vetSize; i++) {
            boolean possui = false;
            int j = 0;
            while (!possui && j < vetSize) {
                possui = vet1[i] == vet2[j];
                j++;
            }

            // Se não possui duplicata, preenche o vet3
            if (!possui) {
                vet3[vet3Size] = vet1[i];
                vet3Size++;
            }
        }

        for (int i = 0; i < vetSize; i++) {
            boolean possui = false;
            int j = 0;
            while (!possui && j < vetSize) {
                possui = vet2[i] == vet1[j];
                j++;
            }

            // Se não possui duplicata, preenche o vet3
            if (!possui) {
                vet3[vet3Size] = vet2[i];
                vet3Size++;
            }
        }

        if (vet3Size > 0) {
            System.out.println("Numeros nao-comuns entre os vetores: ");
            for (int i = 0; i < vet3Size; i++) {
                System.out.println(vet3[i]);
            }
        } else {
            System.out.println("Todos os numeros estao presentes nos dois vetores");
        }

        teclado.close();
    }
}
