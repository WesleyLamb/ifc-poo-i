package br.com.castorsoft;

public class Main {
    static String listar(Produto produto) {
        return produto.descricao + " " + produto.precoCusto + " " + produto.precoVenda + " " + produto.qtde;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Pacote de banha 1kg Sadia", 5, 5.00, 100.00);
        System.out.println(listar(produto));
        produto.movimentar(-1);
        System.out.println(listar(produto));
        System.out.println("Valor em estoque: " + produto.calcularValorEstoque());
    }
}