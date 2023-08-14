// Faça um programa que receba
// • O código do produto comprado;
// • A quantidade comprada do produto
// Calcule e mostre:
// • O preço unitário do produto comprado, seguindo a Tabela I;
// • O preço total da nota;
// • O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
// • O preço final da nota depois do desconto.
// Tabela I
// Código Preço
// 1 a 10 R$ 10,00
// 11 a 20 R$ 15,00
// 21 a 30 R$ 20,00
// 31 a 40 R$ 40,00
// Tabela II
// Preço Total da Nota % de Desconto
// Até R$ 250,00 5%
// Entre R250, 00eR 500,00 10%
// Acima de R$ 500,00 15%

package lista1.exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o codigo do produto: ");
        int codigo = teclado.nextInt();

        System.out.println("Informe a quantidade comprada: ");
        Double qtde = teclado.nextDouble();

        Double total;
        if ((codigo > 1) && (codigo < 10)) {
            total = 10 * qtde;
        } else if ((codigo > 10) && (codigo <= 20)) {
            total = 15 * qtde;
        } else if ((codigo > 20) && (codigo <= 30)) {
            total = 20 * qtde;
        } else if ((codigo > 30) && (codigo <= 40)) {
            total = 40 * qtde;
        } else {
            System.out.println("Codigo invalido.");
            teclado.close();
            return;
        }

        Double desconto;
        if (total < 250) {
            desconto = total * 0.05;
        } else if (total < 500) {
            desconto = total * 0.10;
        } else {
            desconto = total * 0.15;
        }

        System.out.printf("Codigo: %d\nQtde: %.2f\nTotal bruto: %.2f\nDesconto: %.2f\nTotal liq: %.2f\n", codigo, qtde, total, desconto, total - desconto);

        teclado.close();
    }
}
