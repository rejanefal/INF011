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
public interface IEnginer {
   public abstract void iniciarJogo();
   // mais métodos de baixo nível 
   public abstract void construirJanela();
   public abstract void sayHello(String str);
}
