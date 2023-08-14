// Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
// obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.

package lista1.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe o angulo 1, em graus: ");
        int angulo1 = teclado.nextInt();

        System.out.printf("Informe o angulo 2, em graus: ");
        int angulo2 = teclado.nextInt();

        System.out.printf("Informe o angulo 3, em graus: ");
        int angulo3 = teclado.nextInt();

        System.out.printf("Informe a medida do lado 1: ");
        int lado1 = teclado.nextInt();

        System.out.printf("Informe a medida do lado 2: ");
        int lado2 = teclado.nextInt();

        System.out.printf("Informe a medida do lado 3: ");
        int lado3 = teclado.nextInt();

        if ((angulo1 + angulo2 + angulo3) != 180) {
            System.out.println("Triangulo invalido.");
            teclado.close();
            return;
        }

        System.out.print("Tipo do triangulo: ");
        
        if ((angulo1 < 90) && (angulo2 < 90) && (angulo3 < 90)) {
            // Não é retângulo nem obstusângulo
            if ((lado1 != lado2) || (lado2 != lado3) || (lado3 != lado1)) {
                // Pelo menos um dos lados não é igual
                if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)) {
                    System.out.print("Triangulo escaleno.");    
                } else {
                    System.out.print("Triangulo isosceles.");    
                }
            } else {
                System.out.print("Triangulo equilatero.");
            }
            System.out.println("Triangulo acutangulo.");
        } else {
            if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
                System.out.print("Triangulo retangulo.");
            } else {
                System.out.print("Triangulo obtusangulo.");
            }
        }

        teclado.close();
    }
}
