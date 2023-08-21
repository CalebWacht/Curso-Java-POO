package com.mycompany.aula05;

/**
 *
 * @author Caleb Wacht
 */
public enum EnumStatusConta {
    
    ABERTO("ABERTO"),
    FECHADO("FECHADO");
    
    private String value;
    
    private EnumStatusConta(String value){
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
}
