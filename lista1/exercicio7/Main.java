// Faça um programa que leia dois números e apresente o fatorial de todos os números
// que estejam dentro do intervalo definido pelos números que foram lidos

package lista1.exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe o primeiro numero: ");
        int vInicial = teclado.nextInt();

        System.out.printf("Informe o segundo numero: ");
        int vFinal = teclado.nextInt();

        if (vFinal < vInicial) {
            int aux = vInicial;
            vInicial = vFinal;
            vFinal = aux;
        }
        int soma = vInicial;
        for (int i = vFinal; i > vInicial ; i--) {
            soma *= i;
        }

        System.out.printf("Fatorial dos numeros entre %d e %d = %d", vInicial, vFinal, soma);

        teclado.close();
    }
}
