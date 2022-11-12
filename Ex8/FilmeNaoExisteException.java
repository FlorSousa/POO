package Ex8;
public class FilmeNaoExisteException extends Exception {
    FilmeNaoExisteException(String retorno){
        System.out.println(retorno);
    }
}
