package br.com.asilva;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeUsuarios {
    private List<Usuario> grupoFeminino = new ArrayList<>();
    private List<Usuario> grupoMasculino = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        if (usuario.getSexo() == 'F') {
            grupoFeminino.add(usuario);
        } else if (usuario.getSexo() == 'M') {
            grupoMasculino.add(usuario);
        }
    }

    public void imprimirGrupos() {
        System.out.println("\nGrupo Feminino:");
        for (Usuario u : grupoFeminino) {
            System.out.println(u.getNome());
        }

        System.out.println("\nGrupo Masculino:");
        for (Usuario u : grupoMasculino) {
            System.out.println(u.getNome());
        }
    }
}
