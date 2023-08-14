// Faça um programa que receba dez números inteiros e mostre a quantidade de números
// primos dentre os número que foram digitados.

package lista1.exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int primos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o %do numero: ", i + 1);
            int numero = teclado.nextInt();
    
            int divisoes = 0;
            int j = numero;
            while (divisoes <= 2 && j > 0) {
                if (numero % j == 0)
                    divisoes++;
                j--;
            }
            if (divisoes <= 2) {
                primos++;
            } 
        }

        System.out.printf("Quantidade de numeros primos informados: %d", primos);

        teclado.close();
    }
}
