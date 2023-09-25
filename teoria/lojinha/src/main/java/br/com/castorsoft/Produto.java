package br.com.castorsoft;

public class Produto {
    String descricao;
    Double precoCusto;
    Double precoVenda;
    int qtde;

    public Produto(String descricao, int qtde, Double precocusto, Double percLucro) {
        this.descricao = descricao;
        this.qtde = qtde;
        this.precoCusto = precocusto;
        this.precoVenda = this.precoCusto + (this.precoCusto * (percLucro / 100));
    }

    Double calcularValorEstoque() {
        return (precoVenda * qtde);
    }

    void movimentar(int qtde) {
        this.qtde += qtde;
    }
}
