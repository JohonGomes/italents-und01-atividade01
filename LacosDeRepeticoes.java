
public class LacosDeRepeticoes {

	public static void main(String[] args) {
		
		//Laço de Repetição FOR
		// Para tamanho específico para correr
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		//Laço while
		// Usado para quando não sabemos quando a condição será satisfeita.
		
		int x = 1; // variável de controle
		while (x <= 5) {
			System.out.println(x);
			x++; // variável acumuladora que vai somando +1 a cada interação, garante que o loop tenha fim
		}
		
		// Laço Do - While
		// Primeiro faz depois verifica a condição.
		
		System.out.println("---------------------");
		int j = 1;
		
		do {
			System.out.println(j);
			j++;
		} while (j <= 5);

	}

}
