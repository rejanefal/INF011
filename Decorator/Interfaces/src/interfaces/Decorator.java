/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import interfaces.IComponent;

/**
 *
 * @author flavi
 */
public abstract class Decorator implements IComponent {
    protected IComponent decorated;
    
    public void desenhar() {
       decorated.desenhar(); 
    }
    
            
            
    public void setDecorator(IComponent decorated){
        this.decorated = decorated;
    }

    
}
