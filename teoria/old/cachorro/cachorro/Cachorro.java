package cachorro;

public class Cachorro {
    public String nome;
    public String raca;
    public String cor;
    public char sexo;
    public Double peso;
    private void entrarEstado(String estado) {
        System.out.println("O cachorro comecou a: " + estado);
    }

    public void latir() {
        entrarEstado("encher o saco da vizinhanca");
    }
    public void comer() {
        entrarEstado("comer");
    }
    public void dormir() {
        entrarEstado("mimir");
    }
}
