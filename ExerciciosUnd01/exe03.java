package ExerciciosUnd01;
/*
Exercício 3: Laços (for/while)
Crie um programa que imprima os números de 1 a 10 usando um loop.
*/
public class exe03 {
    public static void main(String[] args) {
        for ( int i = 1; i <= 10; i++){
            System.out.println("Número: " + i);
        }

        System.out.println("\n---LOOP WHILE---\n");

        int controle = 1;
        while (controle <=10){
            System.out.println("Loop While: " + controle );
            controle++;
        }
    }

}
