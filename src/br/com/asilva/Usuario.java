package br.com.asilva;

public class Usuario {
    private String nome;
    private char sexo; // 'M' para masculino, 'F' para feminino

    public Usuario(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }
}

