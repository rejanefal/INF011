/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorcapacete;

import interfaces.Decorator;
import interfaces.IPlugin;

/**
 *
 * @author flavi
 */
public class DecoratorCapacete extends Decorator implements IPlugin{

    @Override
    public String msgPlugin() {
        return "Plugin Capacete";
    }
    
    @Override
    public void desenhar(){
        decorated.desenhar();
        System.out.println("Decorando com Capacete");
    }
    
    public String toString(){
        return "Capacete";
    }
   
}
