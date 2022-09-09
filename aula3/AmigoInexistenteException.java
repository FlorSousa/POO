package aula3;

public class AmigoInexistenteException extends Exception {

    
    public AmigoInexistenteException(){
        super();
        
    }

    @Override
    public String toString(){
        return "Amigo não existe";
    }
}
