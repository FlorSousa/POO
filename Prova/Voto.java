package Prova;

public class Voto {
    private int numeroVotado;
    Voto(int numeroVotado){
        this.numeroVotado = numeroVotado;
    }

    public int getNumeroVotado(){
        return this.numeroVotado;
    }

    public void setNumeroVotado(int numero){
        this.numeroVotado = numero;
    }
}
