// Faça uma calculadora de troco, baseado nas cédulas da nossa moeda.

package lista1.exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe um valor para calcularmos um troco: ");
        int valor = teclado.nextInt();

        while (valor > 0) {
            if (valor / 200 > 0) {
                valor -= 200;
                System.out.println("200");
            } else if (valor / 100 > 0) {
                valor -= 100;
                System.out.println("100");
            } else if (valor / 50 > 0) {
                valor -= 50;
                System.out.println("50");
            } else if (valor / 20 > 0) {
                valor -= 20;
                System.out.println("20");
            } else if (valor / 10 > 0) {
                valor -= 10;
                System.out.println("10");
            } else if (valor / 5 > 0) {
                valor -= 5;
                System.out.println("5");
            } else if (valor / 2 > 0) {
                valor -= 2;
                System.out.println("2");
            } else {
                valor -= 1;
                System.out.println("1");
            }
        }
        
        teclado.close();
    }
}
