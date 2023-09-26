package br.com.asilva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeUsuarios gerenciador = new GerenciadorDeUsuarios();

        while (true) {
            System.out.print("Digite o nome do usuário (ou 'sair' para finalizar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo do usuário (M para masculino, F para feminino): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M' || sexo == 'F') {
                Usuario usuario = new Usuario(nome, sexo);
                gerenciador.adicionarUsuario(usuario);
            } else {
                System.out.println("Sexo inválido. Por favor, insira 'M' ou 'F'.");
            }
        }

        gerenciador.imprimirGrupos();
        scanner.close();
    }
}