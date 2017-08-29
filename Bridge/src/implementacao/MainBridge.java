/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao;

import abstracao.IEnginer;
import abstracao.JogoAbstrato;

/**
 *
 * @author flavi
 */
public class MainBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IEnginer jogoBlock        = new Block();
        IEnginer jogoBloquinhos   = new Bloquinhos();
        JogoAbstrato jogoGelo     = new JogoGelo();
        JogoAbstrato jogoDeserto  = new JogoDeserto();
        
        jogoGelo.setJogo(jogoBlock);
        jogoGelo.iniciar();
        jogoGelo.setJogo(jogoBloquinhos);
        jogoGelo.iniciar();
        jogoDeserto.setJogo(jogoBlock);
        jogoDeserto.iniciar();
        jogoDeserto.setJogo(jogoBloquinhos);
        jogoDeserto.iniciar();
    }
    
}
