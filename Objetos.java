
public class Objetos {	
	
	//Atributos
	//Normalmente usamos o PRIVATE nos objetos.
	
	private String nome;
	private int idade;
	private float peso;
	
	
	//Construtor
	//Aqui usamos PUBLIC pq acessaremos de fora do objeto
	
	public Objetos(String nome, int idade, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}	
	
	//Métodos
	//São funções contidades dentro do objeto
	
	public void exibirInfos() {
		System.out.printf("Nome: %s\nIdade: %d\nPeso: %.2f\n", nome, idade, peso);
	}

	public static void main(String[] args) {
		// Vamos instanciar um objeto , criar um objeto.
		
		Objetos pessoa01 = new Objetos("Johon", 37, 68.06f);
		Objetos pessoa02 = new Objetos("Bruno", 25, 65.06f);
		
		System.out.println(pessoa01.nome);
		System.out.println("---------------------------------------");
		
		pessoa01.exibirInfos();
		System.out.println("---------------------------------------");
		pessoa02.exibirInfos();
	}

}
