package aula2;

public class Gato implements Animal{
    public String nome;
    Gato(String nome){
        this.nome = nome;
    }
    @Override
    public void locomove() {
        System.out.println("Esgueirando-se");
        
    }

    @Override
    public void som() {
        System.out.println("Miando");
        
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String valor){
        this.nome = valor;
    }
    
}
