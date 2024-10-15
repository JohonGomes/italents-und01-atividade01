package ExerciciosUnd01;
/*
Exercício 5: Matrizes (Arrays)
Crie uma matriz (array) de números inteiros. Encontre e imprima o maior valor na matriz.
*/

import java.util.Arrays;

public class exe05 {
    public static void main(String[] args) {
        // Criando um array de números inteiros
        int[] numeros = {12, 45, 7, 23, 56, 89, 34, 2, 9, 67};

        //Encontrando o maior valor
        int maiorValor = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maiorValor){
                maiorValor = numeros[i];
            }
        }
        //Imprimindo o resultado:
        System.out.println("O Array é: " + Arrays.toString(numeros));
        System.out.println("O maior valor no array é : " + maiorValor);
    }
}
