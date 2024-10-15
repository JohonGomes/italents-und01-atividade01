package ExerciciosUnd01;
/*
Exercício 4: Listas (ArrayList)
Implemente um programa que permita ao usuário adicionar e remover elementos de uma
lista dinâmica (por exemplo, ArrayList) de números inteiros.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {

        //Cria um ArrayList chamado 'lista' que armazenará números inteiros.
        ArrayList<Integer> lista = new ArrayList<>();

        // Cria um objeto Scanner para ler entradas do usuário , devemos fazer o import da classe.
        Scanner sc = new Scanner(System.in);

        //Inicia um loop infinito que só será interrompido quando o usuário escolher sair.
        while(true){
            System.out.println("\n Escolha uma Opção:");
            System.out.println("1- Adicionar elemento ao Array");
            System.out.println("2- Remover elemento do Array");
            System.out.println("3- Exibir Array");
            System.out.println("4- Sair");

            // Variável armazena opção do usuário e Exibe o menu de opções para o usuário.
            int opcao = sc.nextInt();

            //Lê a opção escolhida pelo usuário.
            switch(opcao){
                case 1:
                    System.out.print("Digite o número a ser adicionado: ");
                    int numero = sc.nextInt();
                    lista.add(numero);
                    System.out.print("Número " + numero + " foi adicionado a Lista com Sucesso!");
                    break;
                case 2:
                    if (lista.isEmpty()){
                        System.out.print("A lista está VAZIA!!!");
                    } else {
                        System.out.print("Escolha o Índice do elemento para remover: ");
                        int indice = sc.nextInt();
                        if ( indice >= 0 && indice < lista.size()){
                            int removido = lista.remove(indice);
                            System.out.println("Elemento " + removido + " removido com sucesso!!!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;
                case 3:
                    if (lista.isEmpty()){
                        System.out.println("A lista está VAZIA!!!");
                    } else {
                        System.out.println("Elementos da lista:");
                        for (int i = 0; i < lista.size(); i++){
                            System.out.println("Índice " + i + ": " + lista.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}
