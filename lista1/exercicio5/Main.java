// Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
// Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
// calcule e mostre:
// • a quantidade de jogadores com idade inferior a 18 anos;
// • a média das idades dos jogadores de cada time;
// • a média das alturas de todos os jogadores do campeonato;
// • a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato.

package lista1.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        final int contTimes = 1;
        final int contJogadores = 3;

        int inferiores18 = 0;
        Double somaAlturas = 0.00;
        int mais80 = 0;
        for (int i = 0; i < contTimes; i++) {
            int somaIdade = 0;
            for (int j = 0; j < contJogadores; j++) {
                System.out.printf("Informe a idade do jogador %d do time %d: ", j + 1, i + 1);
                int idade = teclado.nextInt();

                System.out.printf("Informe a altura do jogador %d do time %d: ", j + 1, i + 1);
                Double altura = teclado.nextDouble();

                System.out.printf("Informe o peso do jogador %d do time %d: ", j + 1, i + 1);
                Double peso = teclado.nextDouble();
                
                somaIdade += idade;
                if (idade < 18)
                    inferiores18++;

                if (peso > 80.0)
                    mais80++;

                somaAlturas += altura;
            }
            System.out.printf("Media da idade dos jogadores do time %d: %.2f\n", i + 1, (double) somaIdade / contJogadores);
        }
        System.out.printf("Quantidade de jogadores com idade inferior a 18 anos: %d\n", inferiores18);
        System.out.printf("Media da altura entre os jogadores: %.2f\n",  ((double) somaAlturas / ((double) contJogadores * contTimes)));
        System.out.printf("Porcentagem de jogadores com mais de 80kg: %.2f\n",  ((double) mais80 / (double) (contJogadores * contTimes) * 100));

        teclado.close();
    }
}
