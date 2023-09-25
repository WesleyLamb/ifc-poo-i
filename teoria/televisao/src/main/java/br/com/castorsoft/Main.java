package br.com.castorsoft;

public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        System.out.println(televisao.canalAtual);

        televisao.buscarCanais();
        System.out.println(televisao.canalAtual);

        televisao.aumentarCanal();
        System.out.println(televisao.canalAtual);

        televisao.aumentarCanal();
        System.out.println(televisao.canalAtual);

        televisao.aumentarCanal();
        System.out.println(televisao.canalAtual);

        televisao.aumentarCanal();
        System.out.println(televisao.canalAtual);

        televisao.diminuirCanal();
        System.out.println(televisao.canalAtual);

        televisao.diminuirCanal();
        System.out.println(televisao.canalAtual);

        televisao.diminuirCanal();
        System.out.println(televisao.canalAtual);

        televisao.diminuirCanal();
        System.out.println(televisao.canalAtual);

        televisao.buscarCanais();
        System.out.println(televisao.canalAtual);
    }
}