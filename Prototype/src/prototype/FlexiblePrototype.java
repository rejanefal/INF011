/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import interfaces.IPrototype;
import java.util.HashMap;

/**
 *
 * @author fguimara
 */
public class FlexiblePrototype {

    private HashMap<String, IPrototype> prototypes = new HashMap<>();
    
    public Boolean addPrototype(String produto, IPrototype prototype){
        if(prototypes.containsKey(produto))
            return false;

        prototypes.put(produto, prototype);
        return true;
    }
    
    public Boolean removePrototype(String produto){
        if(!(prototypes.containsKey(produto)))
            return false;
        prototypes.remove(produto);
        return true;
    }
    
    public IPrototype create(String produto) {
    //public Object create(String produto) {
        //IPrototype prototype = prototypes.get(produto);
        //return prototype.clone();
        if(!(prototypes.containsKey(produto)))
            return null;
        return prototypes.get(produto).clone();
    }
    
    public HashMap<String, IPrototype> getPrototyopes(){
        return this.prototypes;
    }
}
