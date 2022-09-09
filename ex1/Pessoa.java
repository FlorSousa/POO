package ex1;
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String CEP;

    Pessoa(String nome, String CEP){
        this.nome = nome;
        this.CEP = CEP;
    };

    Pessoa(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public int getDataNascimento(){
        return 2022 - this.idade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNomeCompleto(){
        return this.nome + this.sobrenome;
    }

    public String getCep(){
        return this.CEP;
    }
}
