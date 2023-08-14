// Faça um programa que leia um número e calcule o fatorial desse número

package lista1.exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe um numero para calcular o fatorial: ");
        int fat = teclado.nextInt();
        int soma = 1;

        for (int i = fat; i > 1; i--) {
            soma *= i;
        }

        System.out.printf("Fatorial de %d = %d\n", fat, soma);

        teclado.close();
    }
}
