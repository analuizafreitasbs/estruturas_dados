package Arvore.AVLgenerica.src.main.java;

import java.util.Scanner;

public class AVLMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int opcao, valor;
        Arborizavel<Integer> arvore = new AVL<>();
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo da ABP. Ate mais!");
                    break;
                case 1:
                    System.out.print("Digite o valor : ");
                    valor = scanner.nextInt();
                    arvore.inserir(valor);
                    break;
                case 2:
                    System.out.print("Digite o valor : ");
                    valor = scanner.nextInt();
                    arvore.apagar(valor);
                    break;
                case 3:
                    System.out.print("Digite o valor : ");
                    valor = scanner.nextInt();
                    System.out.println(arvore.existe(valor));
                    break;
                case 4:
                    exibirMenuImprimir();
                    int opcaoImprimir = scanner.nextInt();
                    switch (opcaoImprimir) {
                        case 1:
                            System.out.println("");
                            System.out.println("Pre-Ordem: " + arvore.imprimirPreOrdem());
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("");
                            System.out.println("Em-Ordem: " + arvore.imprimirEmOrdem());
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("");
                            System.out.println("Pos-Ordem: " + arvore.imprimirPosOrdem());
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Opcao invalida.");
                    }
                    break;
                case 5:
                    arvore.limpar();
                    System.out.println("Arvore Limpa!");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("=== Arvore Binaria AVL ===");
        System.out.println("0. SAIR");
        System.out.println("1. Inserir");
        System.out.println("2. Apagar");
        System.out.println("3. Existe?");
        System.out.println("4. Imprimir");
        System.out.println("5. Limpar");
        System.out.print("Escolha uma opcao (0-5): ");
    }

    private static void exibirMenuImprimir() {
        System.out.println("1. Imprimir Pre-Ordem");
        System.out.println("2. Imprimir Em-Ordem");
        System.out.println("3. Imprimir Pos-Ordem");
        System.out.print("Escolha uma opcao (1-3): ");
    }
}
