/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao;

import abstracao.IEnginer;

/**
 *
 * @author flavi
 */
public class Bloquinhos implements IEnginer{

    @Override
    public void iniciarJogo() {
        System.out.println("Bloquinhos Iniciado");
    }

    @Override
    public void construirJanela() {
        System.out.println("Janela Bloquinhos Iniciado");
    }

    @Override
    public void sayHello(String str) {
        System.out.println(str + "---Bloquinhos---");
    }
    
}
