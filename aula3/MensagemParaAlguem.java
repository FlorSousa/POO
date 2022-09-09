package aula3;

public class MensagemParaAlguem extends Mensagem {
    String emailDestnatario;
    MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean isAnonima){
        super(texto, emailRemetente, isAnonima);
        this.emailDestnatario = emailDestinatario;
    }
    
    public String getEmailDestinatario(){
        return this.emailDestnatario;
    }

    public String getTextoCompletoAExibir(){
        return "Mensagem para "+this.emailDestnatario+".Texto:"+this.texto;
    }

    public void setEmailDestinatario(String email){
        this.emailDestnatario = email;
    }
}
