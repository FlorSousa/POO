package Prova;

public class Eleitor {
    private String nome;
    private String titulo;
    Eleitor(String titulo, String nome){
        this.nome = nome;
        this.titulo = titulo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public boolean equals(Object obj){
        return this.equals(obj);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
