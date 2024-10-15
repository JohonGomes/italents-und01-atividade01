import java.util.Scanner;

public class ArraysMatrizes {

	public static void main(String[] args) {
		
		int[] numeros = {1,2,3,4,5,6};
		int[] numeros2 = new int[5];
		
		numeros2[0] = 12;
		numeros2[1] = 126;
		numeros2[2] = 9;
		numeros2[3] = 26;
		numeros2[4] = 77;
		
		System.out.println(numeros[2]);
		System.out.println(numeros2[2]);
		
		// Matriz - Linha e Colunas ( x, y )
		
			int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
			
			System.out.println("Matriz");
			System.out.println(matriz[2][1]);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numeros[0] = Integer.parseInt(scanner.nextLine());
		System.out.println(numeros[0]);
		
		
		
		
		
		
	}

	
	
	
	
}
