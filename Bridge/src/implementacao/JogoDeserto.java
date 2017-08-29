/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao;

import abstracao.JogoAbstrato;

/**
 *
 * @author flavi
 */
public class JogoDeserto extends JogoAbstrato{

    @Override
    public void iniciar() {
        engine.iniciarJogo();
        engine.sayHello("****Jogo no Deserto****");
        engine.construirJanela();
        
    }
    // Usar + métodos de Engine
    
}
