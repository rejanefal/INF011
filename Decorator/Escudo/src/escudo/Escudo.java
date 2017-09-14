/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escudo;

import interfaces.Decorator;
import interfaces.IPlugin;

/**
 *
 * @author flavi
 */
public class Escudo extends Decorator implements IPlugin{

    @Override
    public String msgPlugin() {
        return "Plugin Escudo";
    }
    
    @Override
    public void desenhar(){
        decorated.desenhar();
        System.out.println("Decorando com Escudo");
    }
    @Override
    public String toString(){
        return "Escudo";
    }

    
}
