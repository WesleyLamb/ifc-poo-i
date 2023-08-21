// Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
// com sete posições cada um que contenham, respectivamente, o maior elemento de
// cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
// e os dois vetores gerados.

package lista2.exercicio5;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int vetSize = 7;
        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);
    
        int[][] mat = new int[vetSize][vetSize];
        int[] vet1 = new int[vetSize];
        int[] vet2 = new int[vetSize];

        for (int i = 0; i < vetSize; i++) {
            for (int j = 0; j < vetSize; j++) {
                mat[i][j] = rand.nextInt(0, 100);
            }
        }

        for (int i = 0; i < vetSize; i++) {
            int maior = 0;
            int menor = 9999;
            for (int j = 0; j < vetSize; j++) {
                if (mat[i][j] > maior)
                    maior = mat[i][j];
                if (mat[j][i] < menor)
                    menor = mat[j][i];
            }
            vet1[i] = maior;
            vet2[i] = menor;
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < vetSize; i++) {
            for (int j = 0; j < vetSize; j++) {
                System.out.printf("%d\t", mat[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("Vetor com os maiores valores por linha:");
        for (int i = 0; i < vetSize; i++) {
            System.out.printf("%d\t", vet1[i]);
        }

        System.out.println("\nVetor com os menores valores por coluna:");
        for (int i = 0; i < vetSize; i++) {
            System.out.printf("%d\t", vet2[i]);
        }
        System.out.printf("\n");
        teclado.close();
    }
}
