package aula2;



public class Lobo implements Animal{
    public String nome;
    Lobo(String nome){
        this.nome = nome;
    }
    @Override
    public void locomove() {
        System.out.println("Andando");
        
    }

    @Override
    public void som() {
        System.out.println("Uivando");
        
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String valor){
        this.nome = valor;
    }
    
}
