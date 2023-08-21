// Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
// escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
// deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
// um número negativo ou 0.

package lista2.exercicio1;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int arraySize = 200;
        int iMax = 0;
        int i;
        int[] array = new int[arraySize];

        for (i = 0; i < arraySize; i++) {
            System.out.println("Informe um valor maior que zero (Informe 0 ou um valor negativo para encerrar):");
            array[i] = teclado.nextInt();
            if (array[i] <= 0) 
                break;
        }

        iMax = i;

        for (i = 0; i < iMax; i++) {
            if (i % 20 == 0) 
                System.out.println("Valor\tValor^3\tRaiz quad.");

            System.out.println(array[i] +  "\t" + Math.pow(array[i], 3) + "\t" + Math.sqrt(array[i]) +"");
        }

        teclado.close();
    }
}
