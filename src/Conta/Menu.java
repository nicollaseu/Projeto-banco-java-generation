package Conta;

import java.util.Scanner;

import Conta.Util.Cores;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = 0;

        while (true){
            System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_BLACK_BACKGROUND);
            System.out.println("\n*****************************************************"
                               + "\n                                                     "
                               + "\n                BANCO SOLIDEZ                "
                               + "\n                                                     "
                               + "\n*****************************************************"
                               + "\n                                                     "
                               + "\n            1 - Criar Conta                          "
                               + "\n            2 - Listar todas as Contas               "
                               + "\n            3 - Buscar Conta por Numero              "
                               + "\n            4 - Atualizar Dados da Conta             "
                               + "\n            5 - Apagar Conta                         "
                               + "\n            6 - Sacar                                "
                               + "\n            7 - Depositar                            "
                               + "\n            8 - Transferir valores entre Contas      "
                               + "\n            9 - Sair                                 "
                               + "\n                                                     "
                               + "\n*****************************************************"
                               + "\nEntre com a opção desejada:                          "
                               + "\n                                                     ");
            op = sc.nextInt();

            if (op == 9){
                System.out.println(Cores.TEXT_PURPLE +"\nBanco Solidez - Seu investimento começa aqui!");
                sobre();
                System.exit(0);
            }

            switch (op){
                case 1 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");
                }
                case 2 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
                }
                case 3 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
                }
                case 4 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
                }
                case 5 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta\n\n");
                }
                case 6 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
                }
                case 7 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
                }
                case 8 -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
                }
                default -> {
                    System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção inválida!\n");
                }
            }
        }
    }
    public static void sobre(){
        System.out.println("\n*****************************************************"
                           + "\nProjeto Desenvolvido por: "
                           + "\nNicollas Silva de Moraes - nsilvademoraes@gmail.com"
                           + "\nhttps://github.com/nicollaseu/Projeto-banco-java-generation "
                           + "\n*****************************************************");
    }
}