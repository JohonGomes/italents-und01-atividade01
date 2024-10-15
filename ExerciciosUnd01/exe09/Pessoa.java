package ExerciciosUnd01.exe09;

/*
Exercício 9: Programação Orientada a Objetos
Crie uma classe Pessoa com atributos como nome, idade e endereço. Implemente um
programa que permite ao usuário criar e gerenciar uma lista de pessoas.
*/
public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }
}

