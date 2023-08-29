package com.mycompany.ultraemojicombat;

/**
 *
 * @author Caleb Wacht
 */
public class Luta {
    
    private String desafiado;
    
    private String desafiante;
    
    private double rounds;
    
    private boolean aprovada;
    
    public void marcarLuta(){
    
    }
    
    public void lutar(){
    
    }

    public Luta(String desafiado, String desafiante, double rounds) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
    }

    public String getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public double getRounds() {
        return rounds;
    }

    public void setRounds(double rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
