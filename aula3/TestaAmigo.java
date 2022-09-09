package aula3;
public class TestaAmigo {
    public static void main(String[] args) throws Exception {
        SistemaAmigo sistemaAmigo = new SistemaAmigo();
        try{
            sistemaAmigo.cadastraAmigo("Maria", "maria@maria");
            sistemaAmigo.cadastraAmigo("João", "joao@joao");
            sistemaAmigo.configuraAmigoSecretoDe("joao@joao", "maria@maria");
            sistemaAmigo.configuraAmigoSecretoDe("maria@maria", "joao@joao");
            sistemaAmigo.enviaMensagemParaAlguem("Mensagem", "maria@maria", "joao@joao", true);
            sistemaAmigo.enviaMensagemParaTodos("Mensagem par todes", "maria@maria", true);
            for(Mensagem msg :sistemaAmigo.pesquisaMensagensAnonimas()){
                System.out.println(msg.getTextoCompletoAExibir());
            }
            if(sistemaAmigo.pesqusaAmigoSecretoDe("joao@joao").equals("maria@maria")) System.out.println("Ok"); 
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
