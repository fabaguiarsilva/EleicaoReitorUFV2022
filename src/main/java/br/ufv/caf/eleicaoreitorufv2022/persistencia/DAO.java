package br.ufv.caf.eleicaoreitorufv2022.persistencia;

import br.ufv.caf.eleicaoreitorufv2022.entidade.MembroAcademico;
import br.ufv.caf.eleicaoreitorufv2022.entidade.excecao.ExcecaoMatriculaInvalida;
import java.util.ArrayList;

/**
 *
 * @author fabriciosilva
 * @param <E>
 */
public class DAO<E extends MembroAcademico> {
    private ArrayList<E> dados;
    
    public DAO(){
        dados = new ArrayList<E>();
    }
    
    public void add(E elemento) throws ExcecaoMatriculaInvalida{
        if(!elemento.matriculaValida()){
            throw new ExcecaoMatriculaInvalida(elemento.formatoMatricula());
        }
        dados.add(elemento);
    }
    
    public E find(String matricula){
        for(E e : dados){
            if(e.getMatricula().equals(matricula)){
                return e;
            }            
        }
        return null;
    }
    
    public ArrayList<E> getAll(){
        return dados;
    }
    
    
}
