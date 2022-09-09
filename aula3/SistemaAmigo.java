package aula3;

import java.util.ArrayList;

public class SistemaAmigo {
    ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
    ArrayList<Amigo> amigos = new ArrayList<Amigo>();

    public void cadastraAmigo(String nomeAmigo, String emailAmigo){
        Amigo novoAmigo = new Amigo(nomeAmigo, emailAmigo);
        amigos.add(novoAmigo);
    }
    
    public Amigo pesquisaAmigo(String email){
        Amigo returnAmigo = new Amigo();
        for(Amigo amigo : amigos){
            if(amigo.getEmail().equals(email)){
                returnAmigo = amigo;
            }
        }
        return returnAmigo;
    }

    public void enviaMensagemParaTodos(String texto, String emailRemetente, boolean isAnonima){
        MensagemParaTodos novaMensagem = new MensagemParaTodos(texto, emailRemetente, isAnonima);
        mensagens.add(novaMensagem);
    }

    public void enviaMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean isAnonima){
        MensagemParaAlguem novaMensagemParaAlguem = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, isAnonima);
        mensagens.add(novaMensagemParaAlguem);
    }

    public ArrayList<Mensagem> pesquisaMensagensAnonimas(){
        ArrayList<Mensagem> listaAnonima = new ArrayList<Mensagem>();
        for(Mensagem mensagem : mensagens){
            if(mensagem.isAnonima()) listaAnonima.add(mensagem);
        }
        return listaAnonima;
    }

    public ArrayList<Mensagem> pesquisaTodasAsMensagens(){
        return mensagens;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
        Amigo amigoEncontrado = pesquisaAmigo(emailDaPessoa);
    
        if(amigoEncontrado.getNome() == null) throw new AmigoInexistenteException();
        else{
            amigoEncontrado.setEmailAmigoSorteado(emailAmigoSorteado);
            System.out.println("Sorteio feito!");
        }
            

    }

    public String pesqusaAmigoSecretoDe(String emailDaPessoa) throws Exception {
        Amigo amigoEncontrado = pesquisaAmigo(emailDaPessoa);
        if(amigoEncontrado.getNome() == null || amigoEncontrado.getEmailAmigoSorteado() == null) {
            Exception error = amigoEncontrado.getEmailAmigoSorteado() == null ? new AmigoNaoSorteadoException() : new AmigoInexistenteException();
            throw error;
        }
        
        return amigoEncontrado.getEmailAmigoSorteado();
    }
}
