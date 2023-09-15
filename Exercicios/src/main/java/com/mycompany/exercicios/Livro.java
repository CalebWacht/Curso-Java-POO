package com.mycompany.exercicios;

/**
 *
 * @author Caleb Wacht
 */
public class Livro implements Publicacao {

    private String titulo;

    private String autor;

    private Integer totPaginas;

    private Integer pagAtual;

    private boolean aberto;

    private Pessoa leitor;

    
    public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor){
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setAberto(false);
        setLeitor(leitor);
        setPagAtual(0);
    }
    
    public void detalhes() {
        System.out.println("====================");
        System.out.println("Título do livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Páginas totais: " + getTotPaginas());
        System.out.println("Página atual: " + getPagAtual());
        System.out.println("Leitor: " + getLeitor().getNome());
        if (isAberto()) {
            System.out.println("O livro está aberto!");
        } else {
            System.out.println("O livro está fechado!");
        }
    }

    // Métodos derivados da interface Publicação    
    @Override
    public void abrir() {
        setAberto(true);
        System.out.println("Livro Aberto!");
    }

    @Override
    public void fechar() {
        setAberto(false);
        System.out.println("Livro Fechado!");
    }

    @Override
    public void folhear(Integer p) {
        setPagAtual(p);
    }

    @Override
    public void avancarPag() {
        // se a pagAtual foi maior ou igual ao total de páginas do livro significa que o usuário acabou o livro
        if (pagAtual++ >= getTotPaginas()) {
            System.out.println("==============================");
            System.out.println("Parabéns!! Você acabou o livro");
            System.out.println("==============================");

        } else {
            setPagAtual(pagAtual++);
        }
    }

    @Override
    public void voltarPag() {
        // se a pagAtual-- foi menor ou igual ao total de páginas do livro significa que o usuário ja está na primeira página
        if (pagAtual-- <= pagAtual) {
            System.out.println("Você já está na primeira página!");
        } else {
            setPagAtual(pagAtual--);
        }
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Integer getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

}
