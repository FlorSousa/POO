package Prova;

public class Candidato{
    private String nome;
    private int numero;
    private Partido partido;
    Candidato(String nome, int numero, Partido partido){
        this.nome = nome;
        this.numero = numero;
        this.partido = partido;
    }

    public Partido getPartido() {
        return this.partido;
    }

    public void setPartido(Partido partido){
        this.partido = partido;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumero(){
        return this.numero;
    }

}