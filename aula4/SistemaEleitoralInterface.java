package aula4;

public interface SistemaEleitoralInterface {


    public void votar(String numTitulo, int numeroVotado);

    public Candidato obterDadosDoCandidato(int numero);

    public long obterNumeroVotosEmBranco();
}
