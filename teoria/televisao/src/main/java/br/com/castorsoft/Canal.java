package br.com.castorsoft;

public class Canal {
    public Integer codigo;
    public String descricao;

    public Canal(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String toString() {
        return this.codigo + " - " + this.descricao;
    }
}
