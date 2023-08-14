// Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. Calcule e mostre o salário a receber seguindo estas regras:
// • o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
// hora trabalhada;
// • o imposto equivale a 30% do salário bruto;
// • o salário a receber equivale ao salário bruto menos o imposto

package lista1.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        int horas = teclado.nextInt();
        teclado.nextLine();

        Double valorHora = teclado.nextDouble();
        teclado.nextLine();

        Double salBruto = horas * valorHora;
        Double salLiquido = salBruto - (salBruto * 0.3);

        System.out.println("Salario liquido: " + salLiquido);
        teclado.close();
    }
}
