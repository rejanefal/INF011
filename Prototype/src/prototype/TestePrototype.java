/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import interfaces.IPrototype;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author fguimara
 */
public class TestePrototype {
    public static void main(String[] args) {
        FlexiblePrototype factory = new FlexiblePrototype();
        factory.addPrototype("Apagador",new Apagador("Rosa" , 21));
        factory.addPrototype("Controle",new ControleRemoto("Tabajara"));
        Apagador apagador = (Apagador) factory.create("Apagador");
        ControleRemoto controle = (ControleRemoto) factory.create("Controle");
        
        
        for (HashMap.Entry<String, IPrototype> entrada : factory.getPrototyopes().entrySet()) {
            System.out.println(entrada.getKey() + " original: " + entrada.getValue());
            if(entrada.getKey() == "Apagador")
                System.out.println("Apagador Clonado-> " + apagador + "  Tamanho: "+ apagador.getComprimento() + " cor: "+apagador.getCor());
            else
                System.out.println("Controle Clonado-> " + controle + "  Marca: " +controle.getMarca());
        }

    }
}
