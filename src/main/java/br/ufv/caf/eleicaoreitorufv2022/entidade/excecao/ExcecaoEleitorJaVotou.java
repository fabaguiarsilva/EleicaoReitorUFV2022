package br.ufv.caf.eleicaoreitorufv2022.entidade.excecao;

/**
 *
 * @author fabriciosilva
 */
public class ExcecaoEleitorJaVotou extends Exception {

    @Override
    public String getMessage(){
        return "Eleitor já votou!";
    }
}
