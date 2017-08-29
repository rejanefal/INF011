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
public class JogoGelo extends JogoAbstrato{

    @Override
    public void iniciar() {
        engine.iniciarJogo();
        engine.construirJanela();
        engine.sayHello("==Jogo no Gelo==");
        
        // Usar + métodos de Engine
        //abstração --> Sempre agrega a implementação.
    }
    
}
