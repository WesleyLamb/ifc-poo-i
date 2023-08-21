// Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
// códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
// em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
// código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
// deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
// armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
// posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
// seguinte menu na tela:
// • Efetuar depósito
// • Efetuar saque
// • Consultar o ativo bancário (soma de todos os saldos)
// • Finalizar programa
// Obs.1: ao depositar, deve-se solicitar o valor e o código da conta a receber o depósito.
// Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente
// para o saque.

package lista2.exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int vetSize = 3;
        Scanner teclado = new Scanner(System.in);

        int[] codConta = new int[vetSize];
        Double[] saldoConta = new Double[vetSize];

        // Popula os vetores
        for (int i = 0; i < vetSize; i++) {
            int novoCodConta;
            boolean duplicado;
            do {
                duplicado = false;
                System.out.println("Informe o numero da conta: ");
                novoCodConta = teclado.nextInt();            

                // Valida se o código da conta é único e válido
                for (int j = 0; j < vetSize; j++) {
                    if (j != i) {
                        if (novoCodConta == codConta[j]) {
                            duplicado = true;
                            break;
                        }
                    }
                }
                if (duplicado)
                    System.out.println("Numero de conta ja utilizado, informe outro.");
                if (novoCodConta <= 0)
                    System.out.println("O codigo deve ser um numero inteiro maior que zero.");                    
            } while (duplicado || novoCodConta <= 0);
            codConta[i] = novoCodConta;
            Double saldo;
            do {
                System.out.println("Informe o saldo da conta:");
                saldo = teclado.nextDouble();
                if (saldo < 0) 
                    System.out.println("O saldo deve ser maior ou igual a zero");
            } while (saldo < 0);
            saldoConta[i] = saldo;
        }


        int entrada = 0;
        while (entrada != 4) {
            System.out.println("Informe uma opcao:");
            System.out.println("[1] - Deposito");
            System.out.println("[2] - Saque");
            System.out.println("[3] - Consultar ativos bancarios");
            System.out.println("[4] - Sair");
            entrada = teclado.nextInt();

            int conta;
            int i = 0;
            boolean encontrado = false;
            float soma = 0;
            switch (entrada) {
                case 1:
                    do {
                        System.out.println("Informe o codigo da conta (0 para voltar)");
                        conta = teclado.nextInt();
                        if (conta > 0) {
                            i = 0;
                            while (!encontrado && i < vetSize) {
                                encontrado = conta == codConta[i];
                                if (!encontrado)
                                    i++;
                            }
                        }
                        if (conta < 0)
                            System.out.println("Codigo de conta invalido.");
                        if (!encontrado)
                            System.out.println("Codigo de conta nao cadastrado.");
                    } while ((conta < 0) || ((conta > 0) && (!encontrado)));

                    if (encontrado) {
                        Double deposito;
                        do {
                            System.out.println("Informe o valor do deposito:");
                            deposito = teclado.nextDouble();
                            if (deposito < 0) 
                                System.out.println("Valor invalido.");
                        } while(deposito < 0);
                        saldoConta[i] += deposito;
                        System.out.println("Novo saldo: " + saldoConta[i]);
                    }
                    break;
                case 2:
                    do {
                        System.out.println("Informe o codigo da conta (0 para voltar)");
                        conta = teclado.nextInt();
                        if (conta > 0) {
                            i = 0;
                            while (!encontrado && i < vetSize) {
                                encontrado = conta == codConta[i];
                                if (!encontrado)
                                    i++;
                            }
                        }
                        if (conta < 0)
                            System.out.println("Codigo de conta invalido.");
                        if (!encontrado)
                            System.out.println("Codigo de conta nao cadastrado.");
                    } while ((conta < 0) || ((conta > 0) && (!encontrado)));

                    if (encontrado) {
                        Double saque;
                        do {
                            System.out.println("Informe o valor do saque:");
                            saque = teclado.nextDouble();
                            if (saque < 0) 
                                System.out.println("Valor invalido.");
                            if (saldoConta[i] < saque)
                                System.out.println("Saldo insuficiente");
                        } while((saque < 0) || (saldoConta[i] < saque));
                        saldoConta[i] -= saque;
                        System.out.println("Novo saldo: " + saldoConta[i]);
                    }
                    break;
                case 3:
                    for (i = 0; i < vetSize; i++) {
                        soma += saldoConta[i];
                    }
                    System.out.println("Ativos bancarios: " + soma);
                    break;
                case 4:
                    // Não precisa fazer nada, o while vai capturar
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

        teclado.close();
    }
}
