// Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
// que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
// residência, calcule e mostre:
// • o valor de cada quilowatt;
// • o valor a ser pago por essa residência;

package lista1.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor do salario minimo: ");
        Double salMin = teclado.nextDouble();

        System.out.println("Informe o consumo em kW: ");
        Double consumoKw = teclado.nextDouble();

        Double valorKw = salMin * 0.01;
        Double valorConsumo = valorKw * consumoKw;

        System.out.printf("Valor do kW: %.2f\n", valorKw);
        System.out.printf("Valor a ser pago: %.2f\n", valorConsumo);
        
        teclado.close();
    }
}
