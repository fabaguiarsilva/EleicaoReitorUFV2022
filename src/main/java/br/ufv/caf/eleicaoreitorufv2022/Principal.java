package br.ufv.caf.eleicaoreitorufv2022;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fabriciosilva
 */
public class Principal {
    
    public static void main(String[] args) {

        EleicaoReitor eleicaoUFV = new EleicaoReitor();
        eleicaoUFV.iniciarEleicao();
        eleicaoUFV.votacao();
        eleicaoUFV.apuracao();
        
    }
}
