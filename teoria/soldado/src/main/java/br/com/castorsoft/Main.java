package br.com.castorsoft;

public class Main {
    public static void main(String[] args) {
        Soldado soldado1 = new Soldado();
        Soldado soldado2 = new Soldado();
        Soldado soldado3 = new Soldado();
        Soldado soldado4 = new Soldado();
        Soldado soldado5 = new Soldado();
        Soldado soldado6 = new Soldado();
        Soldado soldado7 = new Soldado();
        Soldado soldado8 = new Soldado();
        Soldado soldado9 = new Soldado();
        System.out.println("Distancia do alvo: " + soldado1.getDistanciaDoAlvo());
        soldado1.movimentar(10);
        System.out.println("Distancia do alvo: " + soldado1.getDistanciaDoAlvo());
        System.out.println("Soldado tenta disparar com uma pistola: " + soldado1.disparar("pistola"));

        Soldado soldado10 = new Soldado();
        System.out.println("Soldado tenta disparar com uma banana: " + soldado1.disparar("banana"));
        System.out.println("Soldado tenta disparar com o que vier na frente: " + soldado1.disparar());
        System.out.println("Soldado tenta disparar com uma minigun: " + soldado1.disparar("minigun"));
        System.out.println("Soldado tenta disparar com uma nuclear-launcher:");
        soldado1.disparar("nuclear-launcher");
    }
}