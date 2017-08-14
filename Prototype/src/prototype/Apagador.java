/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import interfaces.IPrototype;

/**
 *
 * @author fguimara
 */
public class Apagador implements IPrototype{
    private String cor;
    private int comprimento;

    public Apagador(String cor, int comprimento) {
        this.cor = cor;
        this.comprimento = comprimento;
    }
    
    @Override
    public IPrototype clone() {
        Apagador apagadorClone = new Apagador(cor, comprimento);
        return apagadorClone;
    }
    
    public String getCor(){
        return this.cor;
    }
    public int getComprimento(){
        return this.comprimento;
    }
}
