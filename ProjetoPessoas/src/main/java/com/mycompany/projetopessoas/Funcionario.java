package com.mycompany.projetopessoas;

/**
 *
 * @author Caleb Wacht
 */
public class Funcionario extends Pessoa{
    
    private String setor;
    
    private boolean trabalhando;
    
    public void mudaTrabalho(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
