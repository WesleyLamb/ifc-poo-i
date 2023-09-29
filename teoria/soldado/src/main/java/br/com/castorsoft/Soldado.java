package br.com.castorsoft;

public class Soldado {
    public static final int TAMANHOPELOTAO = 10;
    private static int _totalSoldados;
    private int _distanciaDoAlvo = 500;

    public Soldado() {
        _totalSoldados++;
    }

    public void movimentar() {
        this.movimentar(10);
    }

    public int getDistanciaDoAlvo() {
        return this._distanciaDoAlvo;
    }

    public void movimentar(int distancia) {
        this._distanciaDoAlvo -= distancia;
    }

    public String disparar() {
        return this.disparar("fuzil");
    }

    public String disparar(String arma) {
        if (_totalSoldados < TAMANHOPELOTAO)  {
            return "Seria suicidio atirar com tão pouca gente!";
        } else {
            switch (arma) {
                case "pistola":
                    return "Pew!";
                case "fuzil":
                    return "Pew Pew Pew!";
                case "minigun":
                    return "RAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!";
                case "bazooka":
                    return "SIONNNN----BOOMMMM";
                case "nuclear-launcher":
                    System.out.println("BOOM!");
                    System.out.println("Todos morreram!");
                    System.exit(0);
                    return "";
                default:
                    return "Isto é uma arma?";
            }
        }
    }
}
