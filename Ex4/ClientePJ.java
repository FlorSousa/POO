package Ex4;

public class ClientePJ extends Cliente {
    public String cnpj;

    public ClientePJ(String nome, String endereco, String email, String cnpj){
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    public String getId(){
        return  this.cnpj;
    }
}
