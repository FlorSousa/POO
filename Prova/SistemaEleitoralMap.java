package Prova;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaEleitoralMap implements SistemaEleitoralInterface {
    private Map<String, Eleitor> eleitores = new HashMap<>();
    private Map<String, Candidato> candidatos = new HashMap<>();
    private List<Voto> votos;
    
    @Override
    public void votar(String numTitulo, int numeroVotado) throws TituloInexistenteException {
        Boolean isValid = false;
        for(Eleitor e: eleitores.values()){
            if(e.getTitulo().equals(numTitulo)) isValid = true;
        }
        if(isValid){
            Voto novoVoto = new Voto(numeroVotado);
            votos.add(novoVoto);
        }else{
            throw new TituloInexistenteException("Esse titulo não existe");
        }
        
    }
    @Override
    public Candidato obterDadosDoCandidato(String nome) throws CandidatoInexistenteException {
        for(Candidato c: candidatos.values()){
            if(c.getNome().equals(nome)) return c;
        }
        return null;
    }

    @Override
    public int contarVotosParaCandidato(int numero) {
        int contaVotos = 0;
        for(Voto v:votos){
            if(v.getNumeroVotado() == numero) contaVotos+=1;
        }
        return contaVotos;
    }
    @Override
    public boolean cadastrarCandidato(String nome, int numero, Partido partido) {
        boolean hasExist = false;
        for(Candidato c:candidatos.values()){
            if(c.getNome().equals(nome)) hasExist = true;
        }

        if(!hasExist){
            Candidato novoCandidato = new Candidato(nome, numero, partido);
            candidatos.put(nome, novoCandidato);
        }

        return !hasExist;
    }
    @Override
    public boolean cadastrarEleitor(String nome, String titulo) {
        boolean hasExist = false;
        for(Eleitor e:eleitores.values()){
            if(e.getTitulo().equals(titulo)) hasExist = true;
        }

        if(!hasExist){
            Eleitor novoEleitor = new Eleitor(titulo, nome);
            eleitores.put(nome, novoEleitor);
        }
        
        return !hasExist;
    }
}
