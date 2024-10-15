
public class ExemplosDadosNaoPrimitivos {
	public static void main(String[] args) {
		
		//tipo caracteres NÃO PRIMITIVOS
		
		String valorString = "Johon"; //coleção de caracteres
		
		//tipo Enum - coleção de caracteres, lista de palavras constantes, sempre fixos
		
		enum DiaDaSemana{
			Domingo, Segunda, Terça, Quarta, Quinta, Sexta, Sábado
		}
		
		//chamando o enum nome + variável = enum.*****
		DiaDaSemana dia = DiaDaSemana.Segunda;
		System.out.println(dia);
		
		//tipo array - uma coleção de informações na mesma variável.
		
		int[] numeros = {1,2,3,4,5}; // arrays - o endereçamento começam como zero.
		
		System.out.println(numeros[1]);
	}

}
