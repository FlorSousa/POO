package Ex4;

public class Cliente {
    public String nome;
    public String endereco;
    public String email;

    public Cliente(String nome, String endereco, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public Cliente(){

    }

    public String getEmail() {
        return email;
    }

    public String getNome(){
        return this.nome;
    }

    public  String getEndereco(){
        return this.endereco;
    }

    @Override
    public String toString(){
        return "";
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
