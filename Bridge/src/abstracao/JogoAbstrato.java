/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracao;

/**
 *
 * @author flavi
 */
public abstract class JogoAbstrato {
    protected IEnginer engine;
    
    public void setJogo(IEnginer engine){
        this.engine = engine;
    }
    
    public abstract void iniciar();
    
}
