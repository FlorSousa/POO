package aula3;

public class AmigoNaoSorteadoException extends Exception {

    
    public AmigoNaoSorteadoException(){
        super();
        
    }

    @Override
    public String toString(){
        return "Amigo não sorteado";
    }
}
