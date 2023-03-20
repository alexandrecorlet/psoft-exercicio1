package main;

import java.util.Scanner;

import fachada.Fachada;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fachada fachada = new Fachada();

        int opcao;
        do {
            menu();
            opcao = sc.nextInt();
        } while (opcao != 7);

    }

    public static void menu() {

        System.out.println(
                "(1) Criar Produto\n"
                + "(2) Consultar Produto\n"
                + "(3) Listar Produtos\n"
                + "(4) Criar Lote\n"
                + "(5) Consultar Lote\n"
                + "(6) Listar lotes\n"
                + "(7) Sair\n"
                + "\n> "
        );

    }

}
