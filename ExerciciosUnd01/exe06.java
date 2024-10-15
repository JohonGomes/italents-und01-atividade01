package ExerciciosUnd01;
/*
Exercício 6: Estruturas Condicionais e Laços
Escreva um programa que encontre todos os números primos entre 1 e 100 e imprima-os na
tela.
 */
public class exe06 {
    public static void main(String[] args) {

        System.out.println("Números primos entre 1 e 100:");

        for (int i = 2; i <= 100; i++){
            if (isPrimo(i)){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPrimo(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
