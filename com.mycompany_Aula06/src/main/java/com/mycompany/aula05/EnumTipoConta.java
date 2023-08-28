package com.mycompany.aula05;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Caleb Wacht
 */
public enum EnumTipoConta  {
    
    CC("CC", "Conta Corrente"),
    CP("POUP", "Conta Poupança");
    
    private final String value, key;
    
    private EnumTipoConta(String key, String value) {
        this.key = key;
        this.value = value;
    }
     
    public String getKey(){
        return key;
    }
    
    public String getValue(){
        return value;
    }
    
    public static List<EnumTipoConta> toListTipoConta() {
        return Arrays.asList(values());
    }
}
