package com.mycompany.projetopessoas;

/**
 *
 * @author Caleb Wacht
 */
public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedrinho");
        p2.setNome("Maria");
        p3.setNome("João");
        p4.setNome("Gustavo");
    }
}
