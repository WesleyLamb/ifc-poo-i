package br.com.castorsoft;

import java.util.Calendar;

public class Pessoa {
    String nome;
    char sexo;
    int anoNascimento;

    public Pessoa(String nome, char sexo, int anoNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    String cumprimentar() {
        if (this.sexo == 'M')
            return "Bom dia, Sr. " + this.nome;
        else if (this.sexo == 'F')
            return "Bom dia, Sra. " + this.nome;
        else
            return "Bom dia, " + this.nome;
    }

    int calcularIdade() {
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.YEAR) - this.anoNascimento;
    }
}
