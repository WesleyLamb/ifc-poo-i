// Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente,
// calcule e mostre 2 vetores resultantes:
// • no primeiro vetor resultante, cada elemento será composto pela soma de cada
// número par do primeiro vetor somado a todos os números do segundo vetor;
// • o segundo vetor resultante será composto pela quantidade de divisores que cada
// número ímpar do primeiro vetor tem no segundo vetor.

package lista2.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int vetSize = 10;

        int[] vet1 = new int[vetSize];
        int[] vet2 = new int[vetSize / 2];
        int[] vet3 = new int[vetSize];
        int[] vet4 = new int[vetSize];

        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Informe um valor para a posicao " + (i + 1) + " do vetor1:");
            vet1[i] = teclado.nextInt();
        }

        for (int i = 0; i < vet2.length; i++) {
            System.out.println("Informe um valor para a posicao " + (i + 1) + " do vetor2:");
            vet2[i] = teclado.nextInt();
        }

        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = 0;
            for (int j = 0; j < vet1.length; j++) {
                if (vet1[j] % 2 == 0)
                    vet3[i] += vet1[j];

                for (int k = 0; k < vet2.length; k++) {
                    vet3[i] += vet2[k];
                }
            }
        }

        for (int i = 0; i < vet4.length; i++) {
            for (int j = 0; j < vet1.length; j++) {
                vet4[i] = 0;
                if (vet1[j] % 2 == 1) {
                    for (int k = 0; k < vet2.length; k++) {
                        if (vet1[j] % vet2[k] == 0) {
                            vet4[i]++;
                        }
                    }
                }
            }
        }

        System.out.println("Vetor1:");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(vet1[i]);
        }

        System.out.println("Vetor2:");
        for (int i = 0; i < vet2.length; i++) {
            System.out.println(vet2[i]);
        }

        System.out.println("Vetor3:");
        for (int i = 0; i < vet3.length; i++) {
            System.out.println(vet3[i]);
        }

        System.out.println("Vetor4:");
        for (int i = 0; i < vet4.length; i++) {
            System.out.println(vet4[i]);
        }

        teclado.close();
    }
}
