package com.mycompany.exercicios;

/**
 *
 * @author Caleb Wacht
 */
public class Pessoa {

    private String nome;

    private Integer idade;

    private String sexo;

    public Pessoa(String nome, Integer idade, String sexo) throws Exception {
        if (idade != null && nome != null && sexo != null) {

            setNome(nome);
            setIdade(idade);
            setSexo(sexo);
        } else {
            throw new Exception("É obrigatório preencher todos os valores!");
        }
    }

    // Getters e Setters
    public void fazerAniversario() {
        setIdade(idade++);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
