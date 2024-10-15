
public class Pessoa02 {
	// atributos
	
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	private boolean habilitada;
	
	// Construtor
	public Pessoa02 (String nome, int idade, float peso, float altura, boolean habilitada) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.habilitada = habilitada;
	}
	
	//Método
	
	public void exibirInfos() {
		System.out.println("Nome: "+ nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Peso: "+ peso);
		System.out.println("Altura: "+ altura);
	}
	
	public void testarAltura(float alturaTeste) {
		if ( alturaTeste <= this.altura) {
			System.out.println("Entrada Permitida");
		}else {
			System.out.println("Não autorizado");
		}
		
	}
	
	public void testarIdade() {
		if (this.idade >= 18) {
			System.out.println("Maior de Idade - Pode beber");
		}else{
			System.out.println("Menor de Idade - Não pode beber");
		}
	}
	
	public float testeIMC() {
		float IMC = this.peso / (this.altura * this.altura);
		if (IMC < 15.5) {
			System.out.println("Magreza");
		}else if(IMC >= 18.5 && IMC < 24.9){
			System.out.println("Normal");			
		}else if(IMC >= 25 && IMC < 29.9) {
			System.out.println("Sobrepeso");			
		}else if(IMC >= 30 && IMC < 34.9) {
			System.out.println("Obesidade Grau 1");			
		}else if(IMC >= 35 && IMC < 39.9) {
			System.out.println("Obesidade Grau 2");			
		}else if(IMC >40) {
			System.out.println("Obesidade Grau 3");			
		}
		
		return IMC;
	}
	
	public void testeHabilitacao() {
		if(this.habilitada) {
			System.out.println("Pessoa Habilitada");
		}else{
			System.out.println("Pessoa não Habilitada");
			
		}
	}
	
	public static void main(String[] args) {
		Pessoa02 pessoa = new Pessoa02("Frederico", 6, 310.2f, 1.88f, true);
		
		pessoa.exibirInfos();
		pessoa.testarAltura(1.40f);
		pessoa.testarIdade();
		float imc = pessoa.testeIMC();
		System.out.println(imc);
		pessoa.testeHabilitacao();
		
	}
	
	

}
