package br.ufv.caf.eleicaoreitorufv2022.entidade.excecao;

/**
 *
 * @author fabriciosilva
 */
public class ExcecaoEleitorInvalido extends Exception {

    @Override
    public String getMessage(){
        return "Eleitor não existe!";
    }
}
