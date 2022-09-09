package aula3;

public class Mensagem {
    protected String texto;
    protected String emailRemetente;
    protected boolean anonima;

    Mensagem(String texto, String emailRemetente, boolean anonima){
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;
    }
    
    
    
    public String getTexto() {
        return this.texto;
    }

    public String getEmailRemetente() {
        return this.emailRemetente;
    }

    public String getTextoCompletoAExibir(){
        return "Texto:"+this.texto;

    }
    public boolean isAnonima(){
        return this.anonima;
    }

    public String getTextoCompletoAExibir;

    public void setTexto(String texto){
        this.texto = texto;
    }

    public void setEmailRemetente(String emailRemetente){
        this.emailRemetente = emailRemetente;
    }
}
