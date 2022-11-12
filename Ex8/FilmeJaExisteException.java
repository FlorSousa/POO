package Ex8;
public class FilmeJaExisteException extends Exception {
    FilmeJaExisteException(String retorno){
        System.out.println(retorno);
    }
}
