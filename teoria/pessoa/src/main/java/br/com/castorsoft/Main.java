package br.com.castorsoft;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Wesley Lamb", 'M', 1998);

        System.out.println(p1.cumprimentar());
        System.out.println("Idade: " + p1.calcularIdade());
    }
}