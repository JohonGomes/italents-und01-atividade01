import java.util.Scanner;

public class Pessoa {

	// Atributos
	private String nome;
	private int idade;
	private float peso;

	// Construtor
	// Aqui usamos PUBLIC pq acessaremos de fora do objeto

	public Pessoa(String nome, int idade, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	// Métodos
	// São funções contidades dentro do objeto

	public void exibirInfos() {
		System.out.printf("Nome: %s\nIdade: %d\nPeso: %.2f\n", nome, idade, peso);
	}
	
	public void aniversario() {
		this.idade = this.idade + 1; //this.idade += + 1;
	}
	
	// Métodos getters e setters 
	// Servem para buscar infos dos objetos ou modificar infos dos objetos.
	
	public String getNome() { // preciso retornar alguma coisa na tela
		return this.nome;
	}	
	public void setNome(String nome) { // preciso guardar alguma info.
		this.nome = nome;
	}
	
	
	public int getIdade() { 
		return this.idade;
	}	
	public void setIdade(int idade) { 
		this.idade = idade;
	}
	
	
	public float getPeso() { 
		return this.peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Pessoa pessoa01 = new Pessoa("Frederico", 20, 85.2f);		
		pessoa01.exibirInfos();
		System.out.println("------------------------------");
		pessoa01.aniversario();
		pessoa01.exibirInfos();
		
		System.out.println("\n-- Alteração feita com o setNome --");
		pessoa01.setNome("Eros");
		pessoa01.exibirInfos();
		
		System.out.println("\n-- Alteração feita com o setPeso --");
		pessoa01.setPeso(50.5f);
		pessoa01.exibirInfos();
		
		// Usando o scanner para criar o Objeto
		System.out.println("\n------------------------------");
		
		System.out.print("Digite o nome: ");
		String nome = scanner.next();
		System.out.print("Digite a idade: ");
		int idade = scanner.nextInt();
		System.out.print("Digite seu peso: ");
		float peso = scanner.nextFloat();
		
		scanner.close(); // fechando o scanner.
		
		Pessoa pessoa02 = new Pessoa(nome, idade, peso);
		System.out.println("\n-- Exibindo info Pessoa02 --");
		pessoa02.exibirInfos();
		
		
	}

}
