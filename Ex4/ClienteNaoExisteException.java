package Ex4;

public class ClienteNaoExisteException extends Exception{
    public ClienteNaoExisteException(String s){
        System.out.println(s);
    }
}
