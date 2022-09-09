package aula3;

public class MensagemParaTodos extends Mensagem{
    MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
        
    }

    public String getTextoCompletoAExibir(){
        return "Mensagem Anonima. Texto: " + this.texto;
    }

}