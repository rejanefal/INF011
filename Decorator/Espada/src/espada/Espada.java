/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espada;

import interfaces.Decorator;
import interfaces.IPlugin;

/**
 *
 * @author flavi
 */
public class Espada extends Decorator implements IPlugin{

    @Override
    public String msgPlugin() {
        return "Plugin Espada";
    }

    @Override
    public void desenhar(){
        decorated.desenhar();
        System.out.println("Decorando com Espada");
    }
    
    public String toString(){
        return "Espada";
    }
    
}
