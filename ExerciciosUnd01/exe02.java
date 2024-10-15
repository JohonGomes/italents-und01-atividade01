package ExerciciosUnd01;

import java.util.Scanner;

/*
Exercício 2: Estruturas Condicionais
Escreva um programa que leia um número e determine se ele é par ou ímpar. Imprima o
resultado na tela.
 */
public class exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // chama classe Scanner para ler o número digitado pelo usuário.

        System.out.print("Escolha um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Esse número é PAR!");
        } else {
            System.out.println("Esse numero é ÍMPAR!");
        }
    }
}
