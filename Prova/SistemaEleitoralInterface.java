package Prova;

public interface SistemaEleitoralInterface {
    public void votar(String numTitulo, int numeroVotado) throws TituloInexistenteException;
    public Candidato obterDadosDoCandidato(String nome) throws CandidatoInexistenteException;
    public int contarVotosParaCandidato(int numero);
    public boolean cadastrarCandidato(String nome, int numero, Partido partido);
    public boolean cadastrarEleitor(String nome, String titulo);
}
