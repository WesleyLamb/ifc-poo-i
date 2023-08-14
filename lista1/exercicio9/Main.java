// Faça um programa que leia um número inteiro e diga se ele é primo

package lista1.exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um numero inteiro para que seja calculado se e primo ou nao: ");
        int numero = teclado.nextInt();

        int divisoes = 0;
        int i = numero;
        while (divisoes <= 2 && i > 0) {
            if (numero % i == 0)
                divisoes++;
            i--;
        }
        if (divisoes <= 2) {
            System.out.printf("O numero %d e primo.\n", numero);
        } else {
            System.out.printf("O numero %d nao e primo.\n", numero);
        }

        teclado.close();
    }
}
