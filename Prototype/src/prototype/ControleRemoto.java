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
public class ControleRemoto implements IPrototype{
    private String marca;

    public ControleRemoto(String marca) {
        this.marca = marca;
    }
    
    
    
    @Override
    public IPrototype clone() {
        ControleRemoto controleClone = new ControleRemoto(marca);
        return controleClone;
    }
    
    public String getMarca(){
        return this.marca;
    }
}
