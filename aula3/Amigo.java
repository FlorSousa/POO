package aula3;

public class Amigo {
    protected String nome;
    protected String email;
    protected String emailAmigoSorteado;
    Amigo(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    Amigo(){
        
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public String getEmailAmigoSorteado(){
        return this.emailAmigoSorteado;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setEmailAmigoSorteado(String emailAmigoSorteado){
        this.emailAmigoSorteado = emailAmigoSorteado;
    }
    
}
