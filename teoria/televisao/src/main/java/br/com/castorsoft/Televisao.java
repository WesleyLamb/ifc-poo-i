package br.com.castorsoft;

import java.util.ArrayList;
import java.util.List;

public class Televisao {
    public Canal canalAtual;
    private List<Canal> canais;
    public int volume;

    public Televisao() {
        canais = new ArrayList<>();
        canais.add(new Canal(-1, "Chuvisco infinito"));
        canalAtual = canais.get(0) ;
    }

    public void buscarCanais() {
        canais.clear();

        canais.add(new Canal(4, "Band"));
        canais.add(new Canal(8, "SBT"));
        canais.add(new Canal(11, "Globo"));
        canais.add(new Canal(27, "Record"));

        canalAtual = canais.get(0);
    }

    public void aumentarCanal() {
        int indexAtual = canais.indexOf(canalAtual);
        if (indexAtual < canais.size() - 1)
            canalAtual = canais.get(indexAtual + 1);
        else
            canalAtual = canais.get(0);
    }

    public void diminuirCanal() {
        int indexAtual = canais.indexOf(canalAtual);
        if (indexAtual > 0)
            canalAtual = canais.get(indexAtual - 1);
        else
            canalAtual = canais.get(canais.size() - 1);
    }

    
}
